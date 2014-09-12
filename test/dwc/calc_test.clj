(ns dwc.calc-test
  (:use dwc.calc)
  (:use midje.sweet))

(fact "Calculate EOO buffers"
 (let [o0 {:decimalLatitude -15.48333 :decimalLongitude -55.68333}
       o1 {:decimalLatitude -15.402872 :decimalLongitude -55.881867}
       o2 {:decimalLatitude -15.402872 :decimalLongitude -55.881867}
       o3 {:decimalLatitude -15.402872 :decimalLongitude -55.881867}]
   (int (:area (eoo [o0]))) => (roughly 262)
   (int (:area (eoo [o0 o1 o2 o3]))) => (roughly 525)
   ))

(fact "Calculate EOO buffers others"
 (let [o0 {:decimalLatitude 10.10 :decimalLongitude 20.20}
       o1 {:decimalLatitude 14.10 :decimalLongitude 21.21}
       o2 {:decimalLatitude 14.10 :decimalLongitude 21.21}
       o3 {:decimalLatitude -15.15 :decimalLongitude -35.35}]
   (int (:area (eoo [ o3  ]) )) => (roughly 262)
   (:area (eoo [ o0 o1 ]) ) => (roughly 519)
   (eoo [ o0 o1 o2 ]) => (eoo [ o0 o1 ])
   ))

(fact "Calculate EOO convex-hull"
 (let [o0 {:decimalLatitude 10.10 :decimalLongitude 20.20}
       o1 {:decimalLatitude 14.10 :decimalLongitude 21.21}
       o2 {:decimalLatitude 14.12 :decimalLongitude 21.22}]
   (:area (eoo [ o0 o1 o2 ]) ) => (roughly 99)
   ))

(fact "AOO"
 (let [o0 {:decimalLatitude -10.10 :decimalLongitude -20.20}
       o1 {:decimalLatitude -24.12 :decimalLongitude -21.22}
       o2 {:decimalLatitude -24.1200001 :decimalLongitude -21.2200001}]
   (:area (aoo [o0 o1 o2]) ) => 8000
   (:area (aoo [o0]) ) => 4000
   ))
