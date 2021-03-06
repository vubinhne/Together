package com.together.view.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.together.R;
import com.together.common.GenericFragment;
import com.together.presenter.NewVocabularyPresenter;

public class NewVocabularyFragment extends
		GenericFragment<NewVocabularyPresenter.View, 
			NewVocabularyPresenter> implements 
			NewVocabularyPresenter.View {

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(
				R.layout.fragment_newmission_vocabulary, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState, 
				NewVocabularyPresenter.class, this);
		
	}
	
	
}
