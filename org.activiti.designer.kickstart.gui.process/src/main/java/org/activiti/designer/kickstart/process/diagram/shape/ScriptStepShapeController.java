/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.designer.kickstart.process.diagram.shape;

import org.activiti.designer.kickstart.process.KickstartProcessPluginImage;
import org.activiti.designer.kickstart.process.diagram.KickstartProcessFeatureProvider;
import org.activiti.workflow.simple.definition.ScriptStepDefinition;

/**
 * A {@link BusinessObjectShapeController} capable of creating and updating shapes for {@link ScriptStepDefinition}
 * objects.
 * 
 * @author Frederik Heremans
 */
public class ScriptStepShapeController extends SimpleIconStepShapeController {

  public ScriptStepShapeController(KickstartProcessFeatureProvider featureProvider) {
    super(featureProvider);
  }

  @Override
  public boolean canControlShapeFor(Object businessObject) {
    return businessObject instanceof ScriptStepDefinition;
  }

  @Override
  protected KickstartProcessPluginImage getIcon() {
    return KickstartProcessPluginImage.SCRIPT_STEP_FEATURE;
  }
}
