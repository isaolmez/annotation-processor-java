package com.isa.annotations;

import java.lang.annotation.Documented;

// Note the usage of annotation defining annotation
/**
 * Only primitive literals, String literals, enums, class literals and their
 * array types are permitted
 */

@Documented
public @interface ClassPreamble {
	/**
	 * Author of the class
	 */
	String author();

	/**
	 * Date of creation
	 */
	String date();

	/**
	 * Current revision
	 */
	int currentRevision() default 1;

	/**
	 * Last modification date
	 */
	String lastModified() default "N/A";

	/**
	 * Last modified by
	 */
	String lastModifiedBy() default "N/A";

	/**
	 * Reviewers who approved the changes
	 */
	String[] reviewers();
}
