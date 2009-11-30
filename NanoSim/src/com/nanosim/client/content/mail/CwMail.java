package com.nanosim.client.content.mail;

import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TreeImages;
import com.nanosim.client.NanosimAnnotations.NanosimSource;

public class CwMail extends Composite{

	 /**
	   * Specifies the images that will be bundled for this example.
	   * 
	   * We will override the leaf image used in the tree. Instead of using a blank
	   * 16x16 image, we will use a blank 1x1 image so it does not take up any
	   * space. Each TreeItem will use its own custom image.
	   */
	  @NanosimSource
	  public interface Images extends TreeImages {
	    AbstractImagePrototype drafts();

	    AbstractImagePrototype inbox();

	    AbstractImagePrototype sent();

	    /**
	     * Use noimage.png, which is a blank 1x1 image.
	     */
	    @Resource("noimage.png")
	    AbstractImagePrototype treeLeaf();
	  }
	  
}
