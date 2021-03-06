package healthyhouse.com.healthyhost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Illnesses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illnesses);
    }

    public void necrotizing(View v) {
        Intent MoveMe = new Intent(this, Necrotizing.class);
        String strName = "Necrotizing Faciitis (Flesh eating Bacteria): Necrotizing fasciitis is an infection caused by bacteria. It can destroy skin, fat, and the tissue covering the muscles within a very short time. It is a rare but serious, as it is fatal in 1 of 4 people who contract it.";
        MoveMe.putExtra("Necro", strName);
        startActivity(MoveMe);

    }
    public void coccidioidomycosis(View v) {
        Intent MoveMe = new Intent(this, Necrotizing.class);
        String strName = "Coccidioidomycosis (Valley Fever): Is caused by the soil-dwelling fungus,Coccidioides immitis. The tiny seeds, or spores, become wind-borne and are inhaled into the lungs, where the infection starts.";
        MoveMe.putExtra("Necro", strName);
        startActivity(MoveMe);
    }

    public void impetigo(View v) {
        Intent MoveMe = new Intent(this, Necrotizing.class);
        String strName = "Impetigo: Impetigo is a skin infection caused by bacteria. The infection often begins when bacteria that normally can be present on the skin entera small cut or scratch. Symptoms of impetigo include yellow, crusty, oozing blisters or sores. The sores can appear anywhere on the body. Scratching the blisters may spread impetigo to other parts of the body. Impetigo is more common in children than adults. Impetigo is most often treated with antibiotics.";
        MoveMe.putExtra("Necro", strName);
        startActivity(MoveMe);
    }

    public void strepthroat(View v) {
        Intent MoveMe = new Intent(this, Necrotizing.class);
        String strName = "Strep Throat: Strep throat is an infection in the throat and the tonsils caused by strep bacteria. It causes a severe sore throat and may cause a fever. It's treated with antibiotics.";
        MoveMe.putExtra("Necro", strName);
        startActivity(MoveMe);
    }
}