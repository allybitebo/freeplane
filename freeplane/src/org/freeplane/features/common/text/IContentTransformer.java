package org.freeplane.features.common.text;

import org.freeplane.features.common.map.NodeModel;

public interface IContentTransformer extends Comparable<IContentTransformer> {
	public static final String DONT_MARK_TRANSFORMED_TEXT = "formula_dont_mark_formulas";

	Object transformContent(Object content, NodeModel node, Object transformedExtension);

	/** used for determining the transformer sequence when more than one transformer is present.
	 * Transformers are sorted by priority numerically, that is the transformer with the least priority value
	 * comes first. */
	int getPriority();
}