package com.birdea.util.josastring.converter;


import com.birdea.util.josastring.data.JosaSet;
import com.birdea.util.josastring.data.KoreanJosa;

/**
 * Created by birdea on 2016-11-22.
 */

public abstract class JosaConverter<T> {
	public abstract JosaSet select(T word, KoreanJosa koreanJosa);
}
