package com.developer.harshi.googlemaps;

import java.util.List;

/**
 * Created by Harshi on 7/16/2017.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
