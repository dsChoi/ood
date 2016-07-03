package com.setin.ch13.ex.no2;

import com.setin.ch13.ex.*;

/**
 * Created by 두석 on 2016-07-03.
 */
public class BasicNavigationFactory extends NavigationFactory {
    @Override
    public GPS createGps() {
        return new CheapGPS();
    }

    @Override
    public Map createMap() {
        return new SmallMap();
    }

    @Override
    public Screen createScreen() {
        return new SDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new SlowPathFinder();
    }
}
