package com.isa.annotation.client;

import com.isa.annotations.ClassPreamble;

@ClassPreamble(
		author = "John Doe",
		date = "3/17/2002",
		currentRevision = 6,
		lastModified = "4/12/2004",
		lastModifiedBy = "Jane Doe",
		// Note array notation
		reviewers = {"Alice", "Bob", "Cindy"})
public class TestClass {

}
