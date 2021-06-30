
package abstractfactory2021;


public class AbstractFactory2021 {

    
    public static void main(String[] args) {
       IFabricaDeCameras cam_Canon = new FabricaCanon();
       
       ICameraFullFrame cam1 = cam_Canon.criarCameraFullFrame();
       cam1.exibirInfoCameraFullFrame();
       
       ICameraCrop cam2 = cam_Canon.criarCameraCrop();
       cam2.exibirInfoCameraCrop();
       
       IFabricaDeCameras cam_Nikon = new FabricaNikon();
       ICameraCrop cam3 = cam_Nikon.criarCameraCrop();
       cam3.exibirInfoCameraCrop();
       
       ICameraFullFrame Cam4 = cam_Nikon.criarCameraFullFrame();
       Cam4.exibirInfoCameraFullFrame();
    }
    
}
