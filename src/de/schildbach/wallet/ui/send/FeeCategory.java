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

package de.schildbach.wallet.ui.send;

import org.bitcoinj.core.Coin;

/**
 * @author Andreas Schildbach
 */
public enum FeeCategory
{
	/**
	 * We don't care when it confirms, but it should confirm at some time. Can be days or weeks.
	 */
	ECONOMIC(Coin.valueOf(10000)), // 0.1 LOG

	/**
	 * Under normal network conditions, confirms within the next 15 minutes. Can take longer, but this should be an
	 * exception. And it should not take days or weeks.
	 */
	NORMAL(Coin.valueOf(20000)), // 0.2 LOG

	/**
	 * Confirms within the next 15 minutes.
	 */
	PRIORITY(Coin.valueOf(30000)); // 0.3 LOG

	public final Coin feePerKb;

	private FeeCategory(final Coin feePerKb)
	{
		this.feePerKb = feePerKb;
	}
}
