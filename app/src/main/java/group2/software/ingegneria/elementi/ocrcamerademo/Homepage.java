package group2.software.ingegneria.elementi.ocrcamerademo;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity
{

    /**
     * |||||||||||||||||||||||
     * ||   UI Components   ||
     * |||||||||||||||||||||||
     */
    private Button btnTakePhoto;
    private TextureView cameraPreview;

    /**
     * |||||||||||||||||||||||||||
     * ||   Variabili private   ||
     * |||||||||||||||||||||||||||
     */

    //The code that identifies the camera request
    private final int CAMERA_REQUEST_CODE = 277;

    //The interface to monitor camera states
    //Implemented by @Leonardo Rossi
    private CameraDevice.StateCallback stateCallback = new CameraDevice.StateCallback() {
        @Override
        public void onOpened(@NonNull CameraDevice camera)
        {
            //createCameraPreview();
        }

        @Override
        public void onDisconnected(@NonNull CameraDevice camera) {

        }

        @Override
        public void onError(@NonNull CameraDevice camera, int error) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //Check if camera permissions have already been requested
        //Implemented by @Leonardo Rossi
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
        {
            String[] permissions = {Manifest.permission.CAMERA};
            ActivityCompat.requestPermissions(this, permissions, CAMERA_REQUEST_CODE);
        }

        //Initialization of UI components
        //Implemented by @Leonardo Rossi
        btnTakePhoto = findViewById(R.id.btnTakePhoto);
        cameraPreview = findViewById(R.id.cameraPreview);

        //Definition of listeners
        //Implemented by @Leonardo Rossi
        cameraPreview.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height)
            {
                //openCamera();
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {

            }
        });

        //Implemented by @Leonardo Rossi
        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //takePhoto();
            }
        });
    }

    /**
     * |||||||||||||||||||||||
     * ||   Metodi privati  ||
     * |||||||||||||||||||||||
     */


    private void openCamera()
    {
        //TODO: Implement the method to open the camera
    }

    private void createCameraPreview()
    {
        //TODO: Implement the method to create camera preview
    }

    private void takePhoto()
    {
        //TODO: Implement the method to take the photo from camera
    }
}
