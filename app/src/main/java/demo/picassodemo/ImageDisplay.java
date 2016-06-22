package demo.picassodemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageDisplay extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.iv_display);
        String url = (String) imageAdapter.getItem(position);

        System.out.println("-----====@@@@@!!!!!!url是" + url);

//        new DownloadImage().execute(url);

        Picasso.with(this).load(url).fit().into(imageView);
    }

//    private  class DownloadImage extends AsyncTask<String, Void, Bitmap>{
//
//        @Override
//        protected Bitmap doInBackground(String... URL) {
//            String imageURL = URL[0];
//            Bitmap bitmap = null;
//            try{
//                InputStream inputStream = new java.net.URL(imageURL).openStream();
//                bitmap = BitmapFactory.decodeStream(inputStream);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return bitmap;
//        }
//
//        @Override
//        protected void onPostExecute(Bitmap result) {
//            super.onPostExecute(result);
//        }
//    }
}
