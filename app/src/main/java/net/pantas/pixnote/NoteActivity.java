package net.pantas.pixnote;

import android.support.v4.app.Fragment;

public class NoteActivity extends SingleFragmentActivity {
	@Override
	protected Fragment createFragment() {
		return new NoteFragment();
	}
}
