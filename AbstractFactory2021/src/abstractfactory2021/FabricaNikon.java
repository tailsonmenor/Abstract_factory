/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory2021;

/**
 *
 * @author rehri
 */
public class FabricaNikon implements IFabricaDeCameras{
    @Override
    public ICameraFullFrame criarCameraFullFrame(){
        return new D650();
    }
    @Override
    public ICameraCrop criarCameraCrop(){
        return new D3500();
    }
}
