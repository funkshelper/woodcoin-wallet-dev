/*
 * Copyright 2015 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.schildbach.wallet.util;

import android.content.Context;

/**
 * @author Andreas Schildbach
 */
public class Toast
{
	private final Context context;

	public Toast(final Context context)
	{
		this.context = context;
	}

	public final void toast(final int textResId, final Object... formatArgs)
	{
		customToast(textResId, android.widget.Toast.LENGTH_SHORT, formatArgs);
	}

	public final void toast(final CharSequence text)
	{
		customToast(text, android.widget.Toast.LENGTH_SHORT);
	}

	public final void longToast(final int textResId, final Object... formatArgs)
	{
		customToast(textResId, android.widget.Toast.LENGTH_LONG, formatArgs);
	}

	public final void longToast(final CharSequence text)
	{
		customToast(text, android.widget.Toast.LENGTH_LONG);
	}

	private void customToast(final int textResId, final int duration, final Object... formatArgs)
	{
		customToast(context.getString(textResId, formatArgs), duration);
	}

	private void customToast(final CharSequence text, final int duration)
	{
		android.widget.Toast.makeText(context, text, duration).show();
	}
}
