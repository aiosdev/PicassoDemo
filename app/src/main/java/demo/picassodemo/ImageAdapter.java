package demo.picassodemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by guoecho on 2016/6/20.
 */
public class ImageAdapter extends BaseAdapter {
    private Context context;
    LayoutInflater layoutInflater;
    public String[] mUrls = {
            "http://ww1.sinaimg.cn/thumb180/95d323a2gw1f4yaigrwc0j20jg0elaeo.jpg",
            "http://ww2.sinaimg.cn/thumb180/95d323a2gw1f4yaihlrzej20no0hsn5l.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaiif5mdj20jg0elgqk.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaij7umdj20no0hs44m.jpg",
            "http://ww1.sinaimg.cn/thumb180/95d323a2gw1f4yaikccx6j20hs0hsn3u.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaimw004j20jg0elgp7.jpg",
            "http://ww1.sinaimg.cn/thumb180/95d323a2gw1f4yaigrwc0j20jg0elaeo.jpg",
            "http://ww2.sinaimg.cn/thumb180/95d323a2gw1f4yaihlrzej20no0hsn5l.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaiif5mdj20jg0elgqk.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaij7umdj20no0hs44m.jpg",
            "http://ww1.sinaimg.cn/thumb180/95d323a2gw1f4yaikccx6j20hs0hsn3u.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaimw004j20jg0elgp7.jpg",
            "http://ww1.sinaimg.cn/thumb180/95d323a2gw1f4yaigrwc0j20jg0elaeo.jpg",
            "http://ww2.sinaimg.cn/thumb180/95d323a2gw1f4yaihlrzej20no0hsn5l.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaiif5mdj20jg0elgqk.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaij7umdj20no0hs44m.jpg",
            "http://ww1.sinaimg.cn/thumb180/95d323a2gw1f4yaikccx6j20hs0hsn3u.jpg",
            "http://ww3.sinaimg.cn/thumb180/95d323a2gw1f4yaimw004j20jg0elgp7.jpg"

    };


    public ImageAdapter(Context context){
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View view;
        ImageView imageview;
        if(convertView == null){
//            view = layoutInflater.inflate(R.layout.activity_image_adapter, null);
            imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 200, 200));
            imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageview.setPadding(0, 0, 0, 0);
        }else{
            imageview = (ImageView) convertView;
        }
//        ImageView imageView = (ImageView) imageview.findViewById(R.id.image_view);
        System.out.println("-------==========++++++++imageView为" + imageview);
        String url = (String) getItem(position);
        Picasso.with(context)
                .load(url)
                .fit()
                .centerCrop().into(imageview);
        return imageview;
    }

    @Override
    public int getCount() {
        return mUrls.length;
    }

    @Override
    public Object getItem(int position) {
        return mUrls[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
