/*
 * Copyright (C) 2009 University of Washington
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

package org.odk.aggregate.process;


public enum ProcessType {
  DELETE("Delete Selected Submissions");

  private String buttonText;
  
  /**
   * Constructor that assigns the button text
   * 
   * @param buttonTxt
   *    button text
   */
  private ProcessType(String buttonTxt) {
    this.buttonText = buttonTxt;
  }

  public String getButtonText() {
    return buttonText;
  }
}
