(ns GoodLuckAK.colors
  (:require [io.aviso.ansi :as ansi]))

(def ^{:arglists '([])}
  chg-color
  "Returns an ANSI color sequence to change foreground color."
  (let [colors (atom [ansi/italic-font
                      ansi/bold-red-font
                      ansi/red-font
                      ansi/bold-cyan-font
                      ansi/cyan-font
                      ansi/bold-blue-font
                      ansi/blue-font
                      ansi/bold-green-font
                      ansi/green-font
                      ansi/bold-magenta-font
                      ansi/magenta-font])]
    (fn [] (first (swap! colors shuffle)))))

(defmacro with
  "Puts the expr into the forms. Inserts x as the
  second item any of the forms."
  [x & forms]
  (let [with* (fn [form] (with-meta `(~(first form) ~x ~@(next form))  (meta form)))]
    `(do
       ~@(map with* forms))))

(def unchg-color
  "Resets the font, clearing bold, italic, color, and background color."
  ansi/reset-font)
