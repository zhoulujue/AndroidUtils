package com.michaelpardo.android.widget;

/*
 * Copyright (C) 2010 Michael Pardo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.michaelpardo.android.R;
import com.michaelpardo.android.util.Ui;

public class Button extends android.widget.Button {
	public Button(Context context) {
		super(context);
		init(context, null, 0);
	}

	public Button(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs, 0);
	}

	public Button(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context, attrs, defStyle);
	}

	private void init(Context context, AttributeSet attrs, int defStyle) {
		final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Button, defStyle, 0);
		final int textStyle = a.getInt(R.styleable.Button_textStyle, 0);
		final String typeface = a.getString(R.styleable.Button_typeface);

		a.recycle();

		if (typeface != null) {
			Ui.setTypeface(this, typeface);
		}
		else if (textStyle > 0) {
			Ui.setTypefaceByStyle(this, textStyle);
		}
	}
}
