/*******************************************************************************
 * Copyright (c) 2014 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 ******************************************************************************/

package org.eclipse.rap.theme.mobile;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rap.demo.controls.ControlsDemo;
import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.Application.OperationMode;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.client.WebClient;


public class BasicApplication implements ApplicationConfiguration {

    @Override
    public void configure(Application application) {
      application.setOperationMode( OperationMode.SWT_COMPATIBILITY );
      application.addEntryPoint( "/", ControlsDemo.class, new HashMap<String, String>() );

      Map<String, String> propertiesA = new HashMap<String, String>();
      propertiesA.put( WebClient.PAGE_TITLE, "RWT Controls Demo (Theme A)" );
      propertiesA.put( WebClient.THEME_ID, "theme-A" );
      application.addEntryPoint( "/theme_a", ControlsDemo.class, propertiesA );
      application.addStyleSheet( "theme-A", "theme_a/theme-a.css" );

      Map<String, String> propertiesI = new HashMap<String, String>();
      propertiesI.put( WebClient.PAGE_TITLE, "RWT Controls Demo (Theme I)" );
      propertiesI.put( WebClient.THEME_ID, "theme-I" );
      application.addEntryPoint( "/theme_i", ControlsDemo.class, propertiesI );
      application.addStyleSheet( "theme-I", "theme_i/theme-i.css" );
    }

}
