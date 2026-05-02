package org.kt.koffeestrap.ui.component

import org.kt.koffeestrap.ui.core.UIModel


abstract class Component<M, C, CX>(
    model: M,
    config: C,
    context: CX
) : UIModel<M, C, CX>(model, config, context) {

    abstract fun renderId(): String
}