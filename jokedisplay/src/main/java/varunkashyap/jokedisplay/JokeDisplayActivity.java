package varunkashyap.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String INTENT_EXTRA_JOKE = "intent:extra:joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

    String joke = getIntent().getStringExtra(INTENT_EXTRA_JOKE);
    TextView jokeView = (TextView) findViewById(R.id.joketext);
    if (jokeView != null) {
        jokeView.setText(joke);
    }
}
}
