/*
 * Copyright (C) 2016 6thSolution.
 *
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
 *
 *
 */

package easymvp.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * {@code CustomView} should be used on {@code android.view.View} classes to enable usage of EasyMVP.
 * <p>
 *  Here is an example:
 *  <pre class="prettyprint">
 *  {@literal @}CustomView(presenter = MyPresenter.class)
 *  public class MyCustomView extends View implement MyView {
 *    //...
 *  }
 *  </pre>
 * @author Saeed Masoumi (saeed@6thsolution.com)
 */
@Retention(value = RUNTIME)
@Target(value = TYPE)
public @interface CustomView {

    /**
     * @return the presenter class.
     */
    Class<? extends easymvp.Presenter> presenter();
}