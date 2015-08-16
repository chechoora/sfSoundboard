package rom.haduken.boohaky.sfsoundboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boohaky on 16-Aug-15.
 */
public class Adapter extends FragmentPagerAdapter {

    List<Fragment> fragments = new ArrayList<>();

    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
