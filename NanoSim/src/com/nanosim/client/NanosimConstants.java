/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.nanosim.client;

import com.google.gwt.i18n.client.Constants;
import com.nanosim.client.content.other.CwAnimation;
import com.nanosim.client.content.other.CwCookies;
import com.nanosim.client.content.other.CwFrame;
import com.nanosim.client.content.tables.CwFlexTable;
import com.nanosim.client.content.tables.CwGrid;

/**
 * Constants used throughout the showcase.
 */
public interface NanosimConstants extends Constants,
    ContentWidget.CwConstants, CwGrid.CwConstants,
    CwFlexTable.CwConstants, CwFrame.CwConstants, CwCookies.CwConstants, 
    CwAnimation.CwConstants {

  /**
   * The path to source code for examples, raw files, and style definitions.
   */
  String DST_SOURCE = "gwtShowcaseSource/";

  /**
   * The destination folder for parsed source code from Showcase examples.
   */
  String DST_SOURCE_EXAMPLE = DST_SOURCE + "java/";

  /**
   * The destination folder for raw files that are included in entirety.
   */
  String DST_SOURCE_RAW = DST_SOURCE + "raw/";

  /**
   * The destination folder for parsed CSS styles used in Showcase examples.
   */
  String DST_SOURCE_STYLE = DST_SOURCE + "css/";

  /**
   * Link to homepage.
   */
  String HOMEPAGE = "http://localhost:8080/NanoSim.html";

   /**
   * The available style themes that the user can select.
   */
  String STYLE_THEME = "chrome";

  String categoryOther();

  String categoryTables();
  
  String categoryMail();

  /**
   * @return the title of the main menu
   */
  String mainMenuTitle();

  /**
   * @return the sub title of the application
   */
  String mainSubTitle();

  /**
   * @return the welcome message
   */
  String welcome();
  
  /**
   * @return the title of the application
   */
  String mainTitle();  
  
  /**
   * @return the title of the about box
   */
  String cwAboutBoxTitle();

  /**
   * @return the message of the about box
   */
  String cwAboutBoxMessage();

}
