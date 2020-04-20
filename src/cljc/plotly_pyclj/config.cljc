(ns plotly-pyclj.config
  (:require
   #?(:cljs [plotly-pyclj.utils :refer-macros [reg-paths]]
      :clj  [plotly-pyclj.utils :refer (reg-path reg-paths)])
   [plotly-pyclj.schema :as schema]))

(def subtree (schema/api-subtree (:config schema/paths)))
(def symbol+paths
  (->> (:config schema/paths)
       schema/api-paths
       (schema/paths->symbol+paths [:config])))
(def help-path (schema/api-help subtree))
(defn help [f & ks] (apply help-path (drop 1 (f)) ks))

(do (reg-paths symbol+paths))

(reg-path config [:config])

;; automatically generated
;; (doseq [x (reg-paths (into (sorted-map) symbol+paths))]
;;   (println x))

(plotly-pyclj.utils/reg-path autosizable [:config :autosizable])
(plotly-pyclj.utils/reg-path displayModeBar [:config :displayModeBar])
(plotly-pyclj.utils/reg-path displayModeBar-values [:config :displayModeBar :values])
(plotly-pyclj.utils/reg-path displaylogo [:config :displaylogo])
(plotly-pyclj.utils/reg-path doubleClick [:config :doubleClick])
(plotly-pyclj.utils/reg-path doubleClick-values [:config :doubleClick :values])
(plotly-pyclj.utils/reg-path doubleClickDelay [:config :doubleClickDelay])
(plotly-pyclj.utils/reg-path doubleClickDelay-min [:config :doubleClickDelay :min])
(plotly-pyclj.utils/reg-path editable [:config :editable])
(plotly-pyclj.utils/reg-path edits [:config :edits])
(plotly-pyclj.utils/reg-path edits-annotationPosition [:config :edits :annotationPosition])
(plotly-pyclj.utils/reg-path edits-annotationTail [:config :edits :annotationTail])
(plotly-pyclj.utils/reg-path edits-annotationText [:config :edits :annotationText])
(plotly-pyclj.utils/reg-path edits-axisTitleText [:config :edits :axisTitleText])
(plotly-pyclj.utils/reg-path edits-colorbarPosition [:config :edits :colorbarPosition])
(plotly-pyclj.utils/reg-path edits-colorbarTitleText [:config :edits :colorbarTitleText])
(plotly-pyclj.utils/reg-path edits-legendPosition [:config :edits :legendPosition])
(plotly-pyclj.utils/reg-path edits-legendText [:config :edits :legendText])
(plotly-pyclj.utils/reg-path edits-shapePosition [:config :edits :shapePosition])
(plotly-pyclj.utils/reg-path edits-titleText [:config :edits :titleText])
(plotly-pyclj.utils/reg-path fillFrame [:config :fillFrame])
(plotly-pyclj.utils/reg-path frameMargins [:config :frameMargins])
(plotly-pyclj.utils/reg-path frameMargins-max [:config :frameMargins :max])
(plotly-pyclj.utils/reg-path frameMargins-min [:config :frameMargins :min])
(plotly-pyclj.utils/reg-path globalTransforms [:config :globalTransforms])
(plotly-pyclj.utils/reg-path linkText [:config :linkText])
(plotly-pyclj.utils/reg-path linkText-noBlank [:config :linkText :noBlank])
(plotly-pyclj.utils/reg-path locale [:config :locale])
(plotly-pyclj.utils/reg-path locales [:config :locales])
(plotly-pyclj.utils/reg-path logging [:config :logging])
(plotly-pyclj.utils/reg-path logging-max [:config :logging :max])
(plotly-pyclj.utils/reg-path logging-min [:config :logging :min])
(plotly-pyclj.utils/reg-path mapboxAccessToken [:config :mapboxAccessToken])
(plotly-pyclj.utils/reg-path modeBarButtons [:config :modeBarButtons])
(plotly-pyclj.utils/reg-path modeBarButtonsToAdd [:config :modeBarButtonsToAdd])
(plotly-pyclj.utils/reg-path modeBarButtonsToRemove [:config :modeBarButtonsToRemove])
(plotly-pyclj.utils/reg-path notifyOnLogging [:config :notifyOnLogging])
(plotly-pyclj.utils/reg-path notifyOnLogging-max [:config :notifyOnLogging :max])
(plotly-pyclj.utils/reg-path notifyOnLogging-min [:config :notifyOnLogging :min])
(plotly-pyclj.utils/reg-path plotGlPixelRatio [:config :plotGlPixelRatio])
(plotly-pyclj.utils/reg-path plotGlPixelRatio-max [:config :plotGlPixelRatio :max])
(plotly-pyclj.utils/reg-path plotGlPixelRatio-min [:config :plotGlPixelRatio :min])
(plotly-pyclj.utils/reg-path plotlyServerURL [:config :plotlyServerURL])
(plotly-pyclj.utils/reg-path queueLength [:config :queueLength])
(plotly-pyclj.utils/reg-path queueLength-min [:config :queueLength :min])
(plotly-pyclj.utils/reg-path responsive [:config :responsive])
(plotly-pyclj.utils/reg-path scrollZoom [:config :scrollZoom])
(plotly-pyclj.utils/reg-path scrollZoom-extras [:config :scrollZoom :extras])
(plotly-pyclj.utils/reg-path scrollZoom-flags [:config :scrollZoom :flags])
(plotly-pyclj.utils/reg-path sendData [:config :sendData])
(plotly-pyclj.utils/reg-path setBackground [:config :setBackground])
(plotly-pyclj.utils/reg-path showAxisDragHandles [:config :showAxisDragHandles])
(plotly-pyclj.utils/reg-path showAxisRangeEntryBoxes [:config :showAxisRangeEntryBoxes])
(plotly-pyclj.utils/reg-path showEditInChartStudio [:config :showEditInChartStudio])
(plotly-pyclj.utils/reg-path showLink [:config :showLink])
(plotly-pyclj.utils/reg-path showSendToCloud [:config :showSendToCloud])
(plotly-pyclj.utils/reg-path showSources [:config :showSources])
(plotly-pyclj.utils/reg-path showTips [:config :showTips])
(plotly-pyclj.utils/reg-path staticPlot [:config :staticPlot])
(plotly-pyclj.utils/reg-path toImageButtonOptions [:config :toImageButtonOptions])
(plotly-pyclj.utils/reg-path topojsonURL [:config :topojsonURL])
(plotly-pyclj.utils/reg-path topojsonURL-noBlank [:config :topojsonURL :noBlank])
(plotly-pyclj.utils/reg-path watermark [:config :watermark])
