// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `_AirportInterfaceOperationsNC.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package ATCDisplay;

public interface _AirportInterfaceOperationsNC
{
    java.util.List<ATCDFlight> getFlights();

    ATCDAirport getAirportInfo();

    void UpdateSimT(float inc);

    float getSimT();

    int getMaxFlights();

    int getPoints();
}
