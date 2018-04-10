package bagusandinata.snackbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(v, "Message Sent", snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(3000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });

                View view = snackbar.getView();
                view.setBackgroundColor(getResources().getColor(R.color.colorSnackbarbackground));

                TextView textView = view.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(getResources().getColor(R.color.colorSnackbarText));

                TextView textViewAction = view.findViewById(android.support.design.R.id.snackbar_action);
                textViewAction.setTextColor(getResources().getColor(R.color.colorSnackbarActionText));

                snackbar.show();
            }
        });
    }
}
