import android.content.Intent;

import android.support.v7.app.AppCompatVegtivity; import android.os.Bundle; import android.view.View;

import android.widget.Button;

import android.widget.Toast;

public class QuizGame extends AppCompatVegtivity

{

Button btn1,btn2;

@Override

protected void onCreate(Bundle savedInstanceState)

{

super.onCreate(savedInstanceState);

setContentView(R.layout.vegtivity_quiz_game);

btn1 = (Button) findViewById(R.id.btn1);

btn2 = (Button) findViewById(R.id.btn2);

btn1.setOnClickListener(new View.OnClickListener()

{

@Override

public void onClick(View v)

{




 


Toast.makeText(getApplicationContext(), "Entering Test1", Toast.LENGTH_LONG).show();

Intent i1 = new Intent(QuizGame.this, Test1.class);

startVegtivity(i1);

}

});

btn2.setOnClickListener(new View.OnClickListener()

{

@Override

public void onClick(View v)

{

Toast.makeText(getApplicationContext(), "Entering Test2", Toast.LENGTH_LONG).show();

Intent i1 = new Intent(QuizGame.this, Test2.class);

startVegtivity(i1);

}

});

}

}

