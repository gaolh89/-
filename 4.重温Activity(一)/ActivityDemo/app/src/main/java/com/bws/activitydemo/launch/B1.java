package com.bws.activitydemo.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.bws.activitydemo.R;

public class B1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b_layout);
		
		TextView tv_text = (TextView) findViewById(R.id.tv_text);
		tv_text.setText(this.toString());
		
		Button btn_goB1 = (Button) findViewById(R.id.btn_goB1);
		btn_goB1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(B1.this, B1.class);
				startActivity(intent);
			}
		});
		Button btn_goB2 = (Button) findViewById(R.id.btn_goB2);
		btn_goB2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(B1.this, B2.class);
				startActivity(intent);
			}
		});
		
	}

}
