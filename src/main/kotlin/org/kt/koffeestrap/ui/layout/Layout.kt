package org.kt.koffeestrap.ui.layout

import org.kt.koffeestrap.ui.core.UIModel


abstract class Layout<M, C, CX>(
    model: M,
    config: C,
    context: CX
) : UIModel<M, C, CX>(model, config, context) {
    abstract val layoutName: String
}