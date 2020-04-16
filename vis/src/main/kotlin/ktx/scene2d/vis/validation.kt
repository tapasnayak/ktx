package ktx.scene2d.vis

import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.utils.Disableable
import com.kotcrab.vis.ui.util.form.FormValidator
import ktx.scene2d.defaultStyle

/**
 * [FormValidator] factory function.
 * @param targetToDisable target actor that will be disabled if form is invalid.
 * @param messageLabel label will be changed when the form is valid or invalid. May be null.
 * @param style name of the [FormValidator] style.
 * @return a new instance of a [FormValidator]
 */
inline fun validator(
  targetToDisable: Disableable? = null,
  messageLabel: Label? = null,
  style: String = defaultStyle,
  init: FormValidator.() -> Unit
): FormValidator = FormValidator(targetToDisable, messageLabel, style).apply(init)