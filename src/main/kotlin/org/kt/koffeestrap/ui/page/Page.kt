package org.kt.koffeestrap.ui.page

import org.kt.koffeestrap.ui.core.UIModel
import org.kt.koffeestrap.ui.layout.Layout


abstract class Page<M, C, CX>(
    model: M,
    config: C,
    context: CX
) : UIModel<M, C, CX>(model, config, context) {

    abstract val layout: Layout<*, *, *>

    abstract val pageTitle: String
}