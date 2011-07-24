(ns clooj.style
  (:import (javax.swing.text SimpleAttributeSet StyleConstants)
           (java.awt Color)))


(defn set-text-color [text-comp offset length color]
  (let [style-doc (.getStyledDocument text-comp)
        attrs (SimpleAttributeSet.)]
     (StyleConstants/setForeground attrs color)
     (.setCharacterAttributes style-doc offset length attrs true)))