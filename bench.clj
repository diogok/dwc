(use 'dwc.calc)

(comment
(println "Half world grid")
(time (make-grid 0 9000 0 18000))
(println (count (make-grid 0 9000 0 18000)))

(println "Full world grid")
(time (make-grid -9000 9000 -18000 18000))
(println (count (make-grid -9000 9000 -18000 18000)))
)

(println "Half world AOO")
(def half-world-occs 
  [ 
   {:decimalLatitude -90 :decimalLongitude -180}
   {:decimalLatitude 0 :decimalLongitude 0} 
  ] )
(time (aoo half-world-occs))

(println "Full world AOO")
(def full-world-occs 
  [ 
   {:decimalLatitude -90 :decimalLongitude -180}
   {:decimalLatitude 0 :decimalLongitude 0} 
   {:decimalLatitude 90 :decimalLongitude 180}
  ] )
(time (aoo full-world-occs))

(println "Some brazil spps")

(time (aoo [
    {:decimalLatitude -12.966667  :decimalLongitude -41.333333}
    {:decimalLatitude -12.564514  :decimalLongitude -41.544109}
    {:decimalLatitude -13 :decimalLongitude -41.4}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -12.47  :decimalLongitude -41.43}
    {:decimalLatitude -12.46  :decimalLongitude -41.46}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -13.337144  :decimalLongitude -41.43961}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -13.337144  :decimalLongitude -41.43961}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.466667  :decimalLongitude -41.433333}
    {:decimalLatitude -12.551035  :decimalLongitude -41.572546}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -13 :decimalLongitude -41}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -12.453889  :decimalLongitude -41.403611}
    {:decimalLatitude -13.337144  :decimalLongitude -41.43961}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.466667  :decimalLongitude -41.433333}
    {:decimalLatitude -12.447222  :decimalLongitude -41.420556}
   ])) 

(time (aoo [
  {:decimalLatitude -20.568944  :decimalLongitude -41.784721}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -20.568944  :decimalLongitude -41.784721}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.531347  :decimalLongitude -44.568832}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.935203  :decimalLongitude -43.471631}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.531347  :decimalLongitude -44.568832}
  {:decimalLatitude -22.531347  :decimalLongitude -44.568832}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -20.568944  :decimalLongitude -41.784721}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.398194  :decimalLongitude -44.634236}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
  {:decimalLatitude -22.531347  :decimalLongitude -44.568832}
  {:decimalLatitude -22.356565  :decimalLongitude -44.660074}
         ]))

(println "A big BR genus")

(def br-occs [
    {:decimalLatitude -12.608004  :decimalLongitude -41.879892}
    {:decimalLatitude -15.849769  :decimalLongitude -49.010191}
    {:decimalLatitude -13.581801  :decimalLongitude -41.131719}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.6   :decimalLongitude -41.4833}
    {:decimalLatitude -14.574814  :decimalLongitude -47.423994}
    {:decimalLatitude -14.133333  :decimalLongitude -47.516667}
    {:decimalLatitude -19.653653  :decimalLongitude -46.914828}
    {:decimalLatitude -13.683333  :decimalLongitude -41.3}
    {:decimalLatitude -16.85  :decimalLongitude -43}
    {:decimalLatitude -20.116667  :decimalLongitude -44.183333}
    {:decimalLatitude -12.716667  :decimalLongitude -47.066667}
    {:decimalLatitude -17.733333  :decimalLongitude -48.616667}
    {:decimalLatitude -13.166667  :decimalLongitude -41.4}
    {:decimalLatitude -24.783333  :decimalLongitude -50}
    {:decimalLatitude -20.066667  :decimalLongitude -43.433333}
    {:decimalLatitude -20.057198  :decimalLongitude -43.373434}
    {:decimalLatitude -14.15  :decimalLongitude -48.066667}
    {:decimalLatitude -14.15  :decimalLongitude -48.066667}
    {:decimalLatitude -18.066667  :decimalLongitude -43.466667}
    {:decimalLatitude -18.483333  :decimalLongitude -54.75}
    {:decimalLatitude -11.616667  :decimalLongitude -46.816667}
    {:decimalLatitude -13.416667  :decimalLongitude -42.133333}
    {:decimalLatitude -20.533333  :decimalLongitude -47.416667}
    {:decimalLatitude -12.608004  :decimalLongitude -41.879892}
    {:decimalLatitude -12.608004  :decimalLongitude -41.879892}
    {:decimalLatitude -12.608004  :decimalLongitude -41.879892}
    {:decimalLatitude -16.55  :decimalLongitude -42.883333}
    {:decimalLatitude -13.4   :decimalLongitude -41.266667}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -11.55  :decimalLongitude -41.15}
    {:decimalLatitude -12.966667  :decimalLongitude -41.333333}
    {:decimalLatitude -12.966667  :decimalLongitude -41.333333}
    {:decimalLatitude -13 :decimalLongitude -41.366667}
    {:decimalLatitude -20.5   :decimalLongitude -43.683333}
    {:decimalLatitude -20.466667  :decimalLongitude -43.716667}
    {:decimalLatitude -12.514997  :decimalLongitude -41.562424}
    {:decimalLatitude -16.023349  :decimalLongitude -41.270469}
    {:decimalLatitude -13.15  :decimalLongitude -41.766667}
    {:decimalLatitude -16.4   :decimalLongitude -51.8}
    {:decimalLatitude -15.85  :decimalLongitude -48.95}
    {:decimalLatitude -25.089962  :decimalLongitude -50.157327}
    {:decimalLatitude -10.7   :decimalLongitude -48.416667}
    {:decimalLatitude -13.583333  :decimalLongitude -41.8}
    {:decimalLatitude -13.583333  :decimalLongitude -41.8}
    {:decimalLatitude -11.077796  :decimalLongitude -41.745559}
    {:decimalLatitude -20.25  :decimalLongitude -46.35}
    {:decimalLatitude -21.466667  :decimalLongitude -47.533333}
    {:decimalLatitude -12.416667  :decimalLongitude -41.766667}
    {:decimalLatitude -22.4   :decimalLongitude -42.95}
    {:decimalLatitude -10.366667  :decimalLongitude -41.166667}
    {:decimalLatitude -13.307288  :decimalLongitude -41.807119}
    {:decimalLatitude -11.566667  :decimalLongitude -47.166667}
    {:decimalLatitude -14.133333  :decimalLongitude -47.516667}
    {:decimalLatitude -14.133333  :decimalLongitude -47.516667}
    {:decimalLatitude -14.133333  :decimalLongitude -47.516667}
    {:decimalLatitude -14.133333  :decimalLongitude -47.516667}
    {:decimalLatitude -13.581801  :decimalLongitude -41.131719}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -14.203681  :decimalLongitude -47.523045}
    {:decimalLatitude -15.883333  :decimalLongitude -52.25}
    {:decimalLatitude -19.088333  :decimalLongitude -48.1425}
    {:decimalLatitude -15.78  :decimalLongitude -47.93}
    {:decimalLatitude -15.78  :decimalLongitude -47.93}
    {:decimalLatitude -14.13  :decimalLongitude -47.51}
    {:decimalLatitude -12.433333  :decimalLongitude -41.45}
    {:decimalLatitude -13 :decimalLongitude -42}
    {:decimalLatitude -12.433333  :decimalLongitude -41.45}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -15.78  :decimalLongitude -47.93}
    {:decimalLatitude -14.5833333 :decimalLongitude -48.55}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -13.33  :decimalLongitude -41.85}
    {:decimalLatitude -13.3166667 :decimalLongitude -41.85}
    {:decimalLatitude -13.33  :decimalLongitude -41.85}
    {:decimalLatitude -12.433333  :decimalLongitude -41.45}
    {:decimalLatitude -12.5   :decimalLongitude -41.333333}
    {:decimalLatitude -12.46  :decimalLongitude -41.42}
    {:decimalLatitude -12.6   :decimalLongitude -41.483333}
    {:decimalLatitude -12.6   :decimalLongitude -41.483333}
    {:decimalLatitude -11.633333  :decimalLongitude -41.033333}
    {:decimalLatitude -11.48  :decimalLongitude -41.08}
    {:decimalLatitude -12.56  :decimalLongitude -41.39}
    {:decimalLatitude -11.633333  :decimalLongitude -41.033333}
    {:decimalLatitude -11.550278  :decimalLongitude -41.156111}
    {:decimalLatitude -11.55  :decimalLongitude -41.16}
    {:decimalLatitude -13.916667  :decimalLongitude -41.377778}
    {:decimalLatitude -13 :decimalLongitude -41.383333}
    {:decimalLatitude -13.25  :decimalLongitude -41.66}
    {:decimalLatitude -12.53  :decimalLongitude -41.56}
    {:decimalLatitude -13.07  :decimalLongitude -41.92}
    {:decimalLatitude -11 :decimalLongitude -41}
    {:decimalLatitude -11.744722  :decimalLongitude -40.730833}
    {:decimalLatitude -11.638611  :decimalLongitude -41.002222}
    {:decimalLatitude -11.333333  :decimalLongitude -40.516667}
    {:decimalLatitude -11.638611  :decimalLongitude -41.002222}
    {:decimalLatitude -11.466667  :decimalLongitude -41.083333}
    {:decimalLatitude -11 :decimalLongitude -41}
    {:decimalLatitude -11 :decimalLongitude -41}
    {:decimalLatitude -11.466667  :decimalLongitude -41.083333}
    {:decimalLatitude -11.666667  :decimalLongitude -41.016667}
    {:decimalLatitude -13.5333333 :decimalLongitude -41.8833333}
    {:decimalLatitude -13.524167  :decimalLongitude -41.946944}
    {:decimalLatitude -13.55  :decimalLongitude -41.95}
    {:decimalLatitude -13.55  :decimalLongitude -41.95}
    {:decimalLatitude -12.42  :decimalLongitude -41.77}
    {:decimalLatitude -19.100833  :decimalLongitude -48.126667}
    {:decimalLatitude -19.088333  :decimalLongitude -48.1425}
    {:decimalLatitude -19.100833  :decimalLongitude -48.126667}
    {:decimalLatitude -19.088333  :decimalLongitude -48.1425}
    {:decimalLatitude -19.088333  :decimalLongitude -48.1425}
    {:decimalLatitude -19.088333  :decimalLongitude -48.1425}
    {:decimalLatitude -19.100833  :decimalLongitude -48.126667}
    {:decimalLatitude -15.9441666 :decimalLongitude -47.8852777}
    {:decimalLatitude -13.27  :decimalLongitude -41.9}
    {:decimalLatitude -13.27  :decimalLongitude -41.9}
    {:decimalLatitude -13.55  :decimalLongitude -41.95}
    {:decimalLatitude -13.25  :decimalLongitude -41.9}
    {:decimalLatitude -13.016667  :decimalLongitude -41.4}
    {:decimalLatitude -12.466667  :decimalLongitude -41.433333}
    {:decimalLatitude -13.55  :decimalLongitude -41.95}
    {:decimalLatitude -13.28  :decimalLongitude -41.87}
    {:decimalLatitude -13.55  :decimalLongitude -41.95}
    {:decimalLatitude -12.47  :decimalLongitude -41.43}
    {:decimalLatitude -13.02  :decimalLongitude -41.4}
    {:decimalLatitude -13.53  :decimalLongitude -41.9}
    {:decimalLatitude -12.6   :decimalLongitude -41.48}
    {:decimalLatitude -11.5780556 :decimalLongitude -41.1077778}
    {:decimalLatitude -11.63  :decimalLongitude -41.03}
    {:decimalLatitude -13.2666667 :decimalLongitude -41.9}
    {:decimalLatitude -11.55  :decimalLongitude -41.15}
    {:decimalLatitude -17.583333  :decimalLongitude -44.966667}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -11.45  :decimalLongitude -41.1166667}
    {:decimalLatitude -22.25  :decimalLongitude -47.816667}
    {:decimalLatitude -16.643186  :decimalLongitude -55.284771}
    {:decimalLatitude -11.494167  :decimalLongitude -41.331389}
    {:decimalLatitude -12.3   :decimalLongitude -47.233333}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -13.3   :decimalLongitude -41.87}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -13.563186  :decimalLongitude -41.728721}
    {:decimalLatitude -12.456389  :decimalLongitude -41.422222}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.433333  :decimalLongitude -41.45}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -13.286991  :decimalLongitude -41.850368}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -13.27  :decimalLongitude -41.9}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.581802  :decimalLongitude -41.13172}
    {:decimalLatitude -13.337144  :decimalLongitude -41.439611}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -11.452222  :decimalLongitude -40.523333}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -13 :decimalLongitude -42}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -13.581802  :decimalLongitude -41.13172}
    {:decimalLatitude -14.574815  :decimalLongitude -47.423995}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -14.203681  :decimalLongitude -47.523045}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12.5   :decimalLongitude -41.333333}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -13.563186  :decimalLongitude -41.728721}
    {:decimalLatitude -13.3166667 :decimalLongitude -41.8333333}
    {:decimalLatitude -14.471572  :decimalLongitude -48.406595}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.3166667 :decimalLongitude -41.85}
    {:decimalLatitude -13.2833333 :decimalLongitude -41.8666667}
    {:decimalLatitude -13.286991  :decimalLongitude -41.850368}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.6   :decimalLongitude -47.883333}
    {:decimalLatitude -13.040471  :decimalLongitude -41.882805}
    {:decimalLatitude -14.133333  :decimalLongitude -48.066667}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -14.203681  :decimalLongitude -47.523045}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -14.203681  :decimalLongitude -47.523045}
    {:decimalLatitude -14.203681  :decimalLongitude -47.523045}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -13 :decimalLongitude -42}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.783675  :decimalLongitude -47.528884}
    {:decimalLatitude -13 :decimalLongitude -42}
    {:decimalLatitude -13.783675  :decimalLongitude -47.528884}
    {:decimalLatitude -21.467174  :decimalLongitude -47.603045}
    {:decimalLatitude -18.055177  :decimalLongitude -43.65238}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -13.783675  :decimalLongitude -47.528884}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -11.45  :decimalLongitude -41.12}
    {:decimalLatitude -13.563186  :decimalLongitude -41.728721}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -11.675278  :decimalLongitude -40.861111}
    {:decimalLatitude -12 :decimalLongitude -41}
    {:decimalLatitude -11 :decimalLongitude -41}
    {:decimalLatitude -14.203681  :decimalLongitude -47.523045}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -15.583333  :decimalLongitude -56.083333}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -15.480278  :decimalLongitude -56.055833}
    {:decimalLatitude -13.857858  :decimalLongitude -41.40002}
    {:decimalLatitude -12.45  :decimalLongitude -41.466667}
    {:decimalLatitude -13.307288  :decimalLongitude -41.807119}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -11.55  :decimalLongitude -41.16}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -11.45  :decimalLongitude -41.12}
    {:decimalLatitude -11.55  :decimalLongitude -41.16}
    {:decimalLatitude -12.95  :decimalLongitude -41.3333333}
    {:decimalLatitude -13.075278  :decimalLongitude -41.378056}
    {:decimalLatitude -11.470278  :decimalLongitude -41.068889}
    {:decimalLatitude -13.25  :decimalLongitude -41.9}
    {:decimalLatitude -12.95  :decimalLongitude -41.333333}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -18.216667  :decimalLongitude -43.6}
    {:decimalLatitude -12.95  :decimalLongitude -41.33}
    {:decimalLatitude -13.283333  :decimalLongitude -41.833333}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -13.084722  :decimalLongitude -41.377778}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -11 :decimalLongitude -41}
    {:decimalLatitude -11 :decimalLongitude -41}
    {:decimalLatitude -13.47  :decimalLongitude -41.83}
    {:decimalLatitude -11.65  :decimalLongitude -39.08}
    {:decimalLatitude -13.75  :decimalLongitude -42.42}
    {:decimalLatitude -13.2666667 :decimalLongitude -41.8666667}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -13.83  :decimalLongitude -42.35}
    {:decimalLatitude -11.150839  :decimalLongitude -63.548377}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -12.53  :decimalLongitude -41.56}
    {:decimalLatitude -13.307288  :decimalLongitude -41.807119}
    {:decimalLatitude -13.583333  :decimalLongitude -41.8}
    {:decimalLatitude -13.307288  :decimalLongitude -41.807119}
    {:decimalLatitude -13.15  :decimalLongitude -41.766667}
    {:decimalLatitude -13.28  :decimalLongitude -41.87}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -13.077868  :decimalLongitude -41.452698}
    {:decimalLatitude -19.155657  :decimalLongitude -48.38911}
    {:decimalLatitude -16.35  :decimalLongitude -50.7}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.3   :decimalLongitude -41.87}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -13 :decimalLongitude -42}
    {:decimalLatitude -13.266666  :decimalLongitude -41.9}
    {:decimalLatitude -13.583333  :decimalLongitude -41.8}
    {:decimalLatitude -12.433333  :decimalLongitude -41.45}
    {:decimalLatitude -18.07  :decimalLongitude -43.47}
    {:decimalLatitude -13.680833  :decimalLongitude -41.311944}
    {:decimalLatitude -13.581802  :decimalLongitude -41.13172}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -11.525812  :decimalLongitude -41.182406}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -12.35681   :decimalLongitude -41.312036}
    {:decimalLatitude -13.040471  :decimalLongitude -41.882805}
    {:decimalLatitude -13.33  :decimalLongitude -41.85}
    {:decimalLatitude -12.452999  :decimalLongitude -41.462248}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -13.040471  :decimalLongitude -41.882805}
    {:decimalLatitude -13.276347  :decimalLongitude -41.748908}
    {:decimalLatitude -19.019656  :decimalLongitude -48.360579}
    {:decimalLatitude -12.941367  :decimalLongitude -41.281258}
    {:decimalLatitude -14.471572  :decimalLongitude -48.406595}
    {:decimalLatitude -14.133333  :decimalLongitude -47.533333}
    {:decimalLatitude -13 :decimalLongitude -42}
    {:decimalLatitude -21.116667  :decimalLongitude -56.466667}
    {:decimalLatitude -11.55  :decimalLongitude -41.16}
    {:decimalLatitude -11.55  :decimalLongitude -41.16}
    {:decimalLatitude -11.48  :decimalLongitude -41.08}
    {:decimalLatitude -13.527138  :decimalLongitude -41.972012}
    {:decimalLatitude -13.307288  :decimalLongitude -41.807119}
    {:decimalLatitude -13.719444  :decimalLongitude -41.378056}
    {:decimalLatitude -13.084722  :decimalLongitude -41.377778}
    {:decimalLatitude -15.655526  :decimalLongitude -55.632316}
    {:decimalLatitude -13.48  :decimalLongitude -41.82}
    {:decimalLatitude -12.6   :decimalLongitude -41.483333}
    {:decimalLatitude -11.63  :decimalLongitude -41.03}
    {:decimalLatitude -10.3666667 :decimalLongitude -41.3333333}
    {:decimalLatitude -11.63  :decimalLongitude -41.03}
    {:decimalLatitude -12.46  :decimalLongitude -41.47}
    {:decimalLatitude -13.28  :decimalLongitude -41.87}
    {:decimalLatitude -14.13  :decimalLongitude -47.51}
    {:decimalLatitude -14.133333  :decimalLongitude -47.516667}
      ])
(time (aoo br-occs))


