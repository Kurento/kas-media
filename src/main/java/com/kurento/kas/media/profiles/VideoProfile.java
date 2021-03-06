/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package com.kurento.kas.media.profiles;

import com.kurento.kas.media.codecs.VideoCodecType;

/**
 * This class represents all configurable video parameters needed to encode a
 * video frame.
 */
public class VideoProfile {

	public static final int DEFAULT_WIDTH = 352;
	public static final int DEFAULT_HEIGHT = 288;
	public static final int DEFAULT_FRAME_RATE = 15;
	public static final int DEFAULT_GOP_SIZE = 6;

	private VideoCodecType videoCodecType;
	private int width;
	private int height;
	private int frameRateNum;
	private int frameRateDen;
	private int bitRate;
	private int gopSize;
	private String description;

	public VideoCodecType getVideoCodecType() {
		return videoCodecType;
	}

	public int getFrameRateNum() {
		return frameRateNum;
	}

	public int getFrameRateDen() {
		return frameRateDen;
	}

	public int getBitRate() {
		return bitRate;
	}

	public int getGopSize() {
		return gopSize;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getDescription() {
		return description;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setFrameRateNum(int frameRateNum) {
		this.frameRateNum = frameRateNum;
	}

	public void setFrameRateDen(int frameRateDen) {
		this.frameRateDen = frameRateDen;
	}

	public void setBitRate(int bitRate) {
		this.bitRate = bitRate;
	}

	public void setGopSize(int gopSize) {
		this.gopSize = gopSize;
	}

	/**
	 * Contructor to asign default falues of:
	 * <ul>
	 * <li>width</li>
	 * <li>height</li>
	 * <li>frameRate</li>
	 * <li>gopSize</li>
	 * </ul>
	 * 
	 * @param videoCodecType
	 * @param bitRate
	 */
	public VideoProfile(VideoCodecType videoCodecType, int bitRate) {
		this.videoCodecType = videoCodecType;
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		this.frameRateNum = DEFAULT_FRAME_RATE;
		this.frameRateDen = 1;
		this.gopSize = DEFAULT_GOP_SIZE;
		this.bitRate = bitRate;
	}

	public VideoProfile(VideoCodecType videoCodecType, int width, int height,
			int frameRateNum, int frameRateDen, int bitRate, int gopSize,
			String description) {
		this.videoCodecType = videoCodecType;
		this.width = width;
		this.height = height;
		this.frameRateNum = frameRateNum;
		this.frameRateDen = frameRateDen;
		this.bitRate = bitRate;
		this.gopSize = gopSize;
		this.description = description;
	}
}
