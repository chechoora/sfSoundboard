package rom.haduken.boohaky.sfsoundboard;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by boohaky on 16-Aug-15.
 */
public class Fragment2 extends Fragment implements View.OnClickListener {

    View root;
    Button btnHadoken,btnShoryuken,btnHurricaneKick,btnUggh,btnHahahaha,btnYATA,btnYAAP,
            btnBirdKick,btnScrean,btnYodel,btnDooo,btnSonicBoom,btnDufGoi,
            btnUpperCut,btnTiger,btnYoga,btnFire,btnFlame,btnPunch,
            btnKick,btnLaugh,btnGhuh,btnGrowl,btnZap,btnZorch;
    String file;
    final MediaPlayer mp = new MediaPlayer();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment2,container,false);
        btnHadoken = (Button)root.findViewById(R.id.btnHadoken);
        btnShoryuken = (Button)root.findViewById(R.id.btnShoryuken);
        btnHurricaneKick = (Button)root.findViewById(R.id.btnHurricaneKick);
        btnHahahaha = (Button)root.findViewById(R.id.btnHahahaha);
        btnYATA = (Button)root.findViewById(R.id.btnYATA);
        btnYAAP = (Button)root.findViewById(R.id.btnYAAP);
        btnDooo = (Button)root.findViewById(R.id.btnDooo);
        btnSonicBoom = (Button)root.findViewById(R.id.btnSonicBoom);
        btnDufGoi = (Button)root.findViewById(R.id.btnDufGoi);
        btnBirdKick = (Button)root.findViewById(R.id.btnBirdKick);
        btnScrean = (Button)root.findViewById(R.id.btnScream);
        btnUggh = (Button)root.findViewById(R.id.btnUggh);
        btnUpperCut = (Button)root.findViewById(R.id.btnUpperCut);
        btnYoga = (Button)root.findViewById(R.id.btnYoga);
        btnFire = (Button)root.findViewById(R.id.btnFire);
        btnTiger = (Button)root.findViewById(R.id.btnTiger);
        btnYodel = (Button)root.findViewById(R.id.btnYodel);
        btnFlame = (Button)root.findViewById(R.id.btnFlame);
        btnPunch = (Button)root.findViewById(R.id.btnPunch);
        btnKick = (Button)root.findViewById(R.id.btnKick);
        btnLaugh = (Button)root.findViewById(R.id.btnLaugh);
        btnGhuh = (Button)root.findViewById(R.id.btnGhuh);
        btnGrowl = (Button)root.findViewById(R.id.btnGrowl);
        btnZap = (Button)root.findViewById(R.id.btnZap);
        btnZorch = (Button)root.findViewById(R.id.btnZorch);
        btnHadoken.setOnClickListener(this);
        btnShoryuken.setOnClickListener(this);
        btnHurricaneKick.setOnClickListener(this);
        btnHahahaha.setOnClickListener(this);
        btnYATA.setOnClickListener(this);
        btnYAAP.setOnClickListener(this);
        btnDooo.setOnClickListener(this);
        btnSonicBoom.setOnClickListener(this);
        btnDufGoi.setOnClickListener(this);
        btnBirdKick.setOnClickListener(this);
        btnScrean.setOnClickListener(this);
        btnUggh.setOnClickListener(this);
        btnUpperCut.setOnClickListener(this);
        btnYoga.setOnClickListener(this);
        btnFire.setOnClickListener(this);
        btnTiger.setOnClickListener(this);
        btnYodel.setOnClickListener(this);
        btnFlame.setOnClickListener(this);
        btnPunch.setOnClickListener(this);
        btnKick.setOnClickListener(this);
        btnLaugh.setOnClickListener(this);
        btnGhuh.setOnClickListener(this);
        btnGrowl.setOnClickListener(this);
        btnZap.setOnClickListener(this);
        btnZorch.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        if (mp.isPlaying()) {
            mp.stop();
        }
        try {
            mp.reset();
            AssetFileDescriptor afd;
            switch (v.getId()) {
                case R.id.btnHadoken:
                    file = "hadoken.mp3";
                    break;
                case R.id.btnShoryuken:
                    file = "shoryuken.mp3";
                    break;
                case R.id.btnHurricaneKick:
                    file = "hurricane_kick.mp3";
                    break;
                case R.id.btnHahahaha:
                    file = "hahahahaha.mp3";
                    break;
                case R.id.btnYATA:
                    file = "ya_ta.mp3";
                    break;
                case R.id.btnUggh:
                    file = "uuugh.mp3";
                    break;
                case R.id.btnUpperCut:
                    file = "uppercut.mp3";
                    break;
                case R.id.btnYoga:
                    file = "yoga.mp3";
                    break;
                case R.id.btnFire:
                    file = "fire.mp3";
                    break;
                case R.id.btnTiger:
                    file = "tiger.mp3";
                    break;
                case R.id.btnYodel:
                    file = "yodel.mp3";
                    break;
                case R.id.btnFlame:
                    file = "flame.mp3";
                    break;
                case R.id.btnYAAP:
                    file = "yaap.mp3";
                    break;
                case R.id.btnDooo:
                    file = "dooo.mp3";
                    break;
                case R.id.btnSonicBoom:
                    file = "sonic_boom.mp3";
                    break;
                case R.id.btnDufGoi:
                    file = "duf_goi.mp3";
                    break;
                case R.id.btnBirdKick:
                    file = "bird_kick.mp3";
                    break;
                case R.id.btnScream:
                    file = "chun_li_scream.mp3";
                    break;
                case R.id.btnPunch:
                    file = "punch.mp3";
                    break;
                case R.id.btnZap:
                    file = "zap.mp3";
                    break;
                case R.id.btnGrowl:
                    file = "growl.mp3";
                    break;
                case R.id.btnGhuh:
                    file = "ghuh.mp3";
                    break;
                case R.id.btnLaugh:
                    file = "laugh.mp3";
                    break;
                case R.id.btnKick:
                    file = "kick.mp3";
                    break;
                case R.id.btnZorch:
                    file = "zorch.mp3";
                    break;
            }
            afd = getActivity().getAssets().openFd(file);
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
