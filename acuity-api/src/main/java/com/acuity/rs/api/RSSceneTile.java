package com.acuity.rs.api;

import com.acuity.api.rs.wrappers.scene.SceneTile;

//Generated by the injector on run.

//Extends RSNode
public interface RSSceneTile extends RSNode {

    RSSceneBoundary getBoundary();

    RSSceneBoundaryDecor getBoundaryDecor();

    RSSceneElement[] getElements();

    RSItemLayer getItemLayer();

    RSSceneTileModel getModel();

    RSSceneTilePaint getPaint();

    int getPlane();

    int getSceneX();

    int getSceneY();

    RSSceneTileDecor getTileDecor();

    SceneTile getWrapper();
}
