package goodev.org.boxinsetlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.BoxInsetLayout;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round_activity_main);
        final BoxInsetLayout layout = (BoxInsetLayout) findViewById(R.id.root);
        Log.e("BoxInset", layout.isRound()+" " +layout.getInsets());
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),""+layout.getChildAt(0).getPaddingLeft()+" . "+layout.getChildAt(0).getPaddingRight(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
