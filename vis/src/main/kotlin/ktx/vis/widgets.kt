package ktx.vis

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.Drawable
import com.kotcrab.vis.ui.VisUI
import com.kotcrab.vis.ui.layout.FloatingGroup
import com.kotcrab.vis.ui.layout.GridGroup
import com.kotcrab.vis.ui.layout.HorizontalFlowGroup
import com.kotcrab.vis.ui.layout.VerticalFlowGroup
import com.kotcrab.vis.ui.widget.*
import com.kotcrab.vis.ui.widget.color.BasicColorPicker
import com.kotcrab.vis.ui.widget.color.ExtendedColorPicker
import com.kotcrab.vis.ui.widget.spinner.Spinner
import com.kotcrab.vis.ui.widget.spinner.SpinnerModel
import com.kotcrab.vis.ui.widget.toast.ToastTable

/** @author Kotcrab */

/** @see [VisTable] */
class KVisTable : VisTable, TableWidgetFactory {
  constructor(setVisDefaults: Boolean) : super(setVisDefaults)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

class KToastTable : ToastTable, TableWidgetFactory {
  constructor(setVisDefaults: Boolean) : super(setVisDefaults)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

class KVisWindow : VisWindow, TableWidgetFactory {
  constructor(title: String, styleName: String) : super(title, styleName)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [Button] */
class KButton : Button, TableWidgetFactory {
  constructor(styleName: String) : super(VisUI.getSkin(), styleName)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [VisCheckBox] */
class KVisCheckBox : VisCheckBox, TableWidgetFactory {
  constructor(text: String, styleName: String) : super(text, styleName)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [VisRadioButton] */
class KVisRadioButton : VisRadioButton, TableWidgetFactory {
  constructor(text: String) : super(text)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [VisTextButton] */
class KVisTextButton : VisTextButton, TableWidgetFactory {
  constructor(text: String, styleName: String) : super(text, styleName)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [VisImageButton] */
class KVisImageButton : VisImageButton, TableWidgetFactory {
  constructor(imageUp: Drawable, imageDown: Drawable, imageChecked: Drawable) : super(imageUp, imageDown, imageChecked)
  constructor(styleName: String) : super(styleName)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [VisImageTextButton] */
class KVisImageTextButton : VisImageTextButton, TableWidgetFactory {
  constructor(text: String, styleName: String) : super(text, styleName)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [VisTree] */
class KVisTree : VisTree, WidgetGroupWidgetFactory {
  constructor(styleName: String) : super(styleName)

  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

class KBasicColorPicker : BasicColorPicker, TableWidgetFactory {
  constructor(styleName: String) : super(styleName, null)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

class KExtendedColorPicker : ExtendedColorPicker, TableWidgetFactory {
  constructor(styleName: String) : super(styleName, null)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

class KSpinner : Spinner, TableWidgetFactory {
  constructor(styleName: String, name: String, model: SpinnerModel) : super(styleName, name, model)

  override fun addActorToWidgetGroup(actor: Actor): Cell<*> = add(actor)
}

/** @see [Stack] */
class KStack : Stack, WidgetGroupWidgetFactory {
  constructor() : super()

  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

/** @see [HorizontalGroup] */
class KHorizontalGroup : HorizontalGroup(), WidgetGroupWidgetFactory {
  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

/** @see [HorizontalFlowGroup] */
class KHorizontalFlowGroup : HorizontalFlowGroup, WidgetGroupWidgetFactory {
  constructor(spacing: Float) : super(spacing)

  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

/** @see [VerticalGroup] */
class KVerticalGroup : VerticalGroup(), WidgetGroupWidgetFactory {
  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

/** @see [VerticalFlowGroup] */
class KVerticalFlowGroup : VerticalFlowGroup, WidgetGroupWidgetFactory {
  constructor(spacing: Float) : super(spacing)

  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

/** @see [GridGroup] */
class KGridGroup : GridGroup, WidgetGroupWidgetFactory {
  constructor(itemSize: Float, spacing: Float) : super(itemSize, spacing)

  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}

/** @see [FloatingGroup] */
class KFloatingGroup : FloatingGroup, WidgetGroupWidgetFactory {
  constructor() : super()
  constructor(prefWidth: Float, prefHeight: Float) : super(prefWidth, prefHeight)

  override fun addActorToWidgetGroup(actor: Actor): Any {
    addActor(actor)
    return actor
  }
}