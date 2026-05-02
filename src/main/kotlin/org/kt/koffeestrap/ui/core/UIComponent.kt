package org.kt.koffeestrap.ui.core


abstract class UIComponent<M, C, CX>(
    open val model: M,
    open val config: C,
    open val context: CX
) {
    abstract val templatePath: String
}
