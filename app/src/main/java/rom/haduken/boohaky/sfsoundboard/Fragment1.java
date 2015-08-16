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
public class Fragment1 extends Fragment implements View.OnClickListener {

    View root;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnYou,btnRound,btnPerfect,btnFight,btnFinal,btnWin,btnLose;
    Button btnBrazi,btnChina,btnIndia,btnJapan,btnSpain,btnThailand,btnUSA,btnUSSR;
    String file;
    final MediaPlayer mp = new MediaPlayer();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment1, container, false);
        btn1 = (Button) root.findViewById(R.id.btn1);
        btn2 = (Button) root.findViewById(R.id.btn2);
        btn3 = (Button) root.findViewById(R.id.btn3);
        btn4 = (Button) root.findViewById(R.id.btn4);
        btn5 = (Button) root.findViewById(R.id.btn5);
        btn6 = (Button) root.findViewById(R.id.btn6);
        btn7 = (Button) root.findViewById(R.id.btn7);
        btn8 = (Button) root.findViewById(R.id.btn8);
        btn9 = (Button) root.findViewById(R.id.btn9);
        btnYou = (Button) root.findViewById(R.id.btnYou);
        btnRound = (Button) root.findViewById(R.id.btnRound);
        btnFight = (Button) root.findViewById(R.id.btnFight);
        btnFinal = (Button) root.findViewById(R.id.btnFinal);
        btnPerfect = (Button) root.findViewById(R.id.btnPerfect);
        btnWin = (Button) root.findViewById(R.id.btnWin);
        btnLose = (Button) root.findViewById(R.id.btnLose);
        btnBrazi = (Button) root.findViewById(R.id.btnBrazil);
        btnChina = (Button) root.findViewById(R.id.btnChina);
        btnIndia = (Button) root.findViewById(R.id.btnIndia);
        btnJapan = (Button) root.findViewById(R.id.btnJapan);
        btnSpain = (Button) root.findViewById(R.id.btnSpain);
        btnThailand = (Button) root.findViewById(R.id.btnThailand);
        btnUSA = (Button) root.findViewById(R.id.btnUSA);
        btnUSSR = (Button) root.findViewById(R.id.btnUSSR);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnYou.setOnClickListener(this);
        btnRound.setOnClickListener(this);
        btnFight.setOnClickListener(this);
        btnFinal.setOnClickListener(this);
        btnPerfect.setOnClickListener(this);
        btnRound.setOnClickListener(this);
        btnFight.setOnClickListener(this);
        btnFinal.setOnClickListener(this);
        btnPerfect.setOnClickListener(this);
        btnBrazi.setOnClickListener(this);
        btnChina.setOnClickListener(this);
        btnIndia.setOnClickListener(this);
        btnJapan.setOnClickListener(this);
        btnSpain.setOnClickListener(this);
        btnThailand.setOnClickListener(this);
        btnUSA.setOnClickListener(this);
        btnUSSR.setOnClickListener(this);
        btnWin.setOnClickListener(this);
        btnLose.setOnClickListener(this);
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
                case R.id.btn1:
                    file = "_01.mp3";
                    break;
                case R.id.btn2:
                    file = "_02.mp3";
                    break;
                case R.id.btn3:
                    file = "_03.mp3";
                    break;
                case R.id.btn4:
                    file = "_04.mp3";
                    break;
                case R.id.btn5:
                    file = "_05.mp3";
                    break;
                case R.id.btn6:
                    file = "_06.mp3";
                    break;
                case R.id.btn7:
                    file = "_07.mp3";
                    break;
                case R.id.btn8:
                    file = "_08.mp3";
                    break;
                case R.id.btn9:
                    file = "_09.mp3";
                    break;
                case R.id.btnYou:
                    file = "you.mp3";
                    break;
                case R.id.btnRound:
                    file = "round.mp3";
                    break;
                case R.id.btnPerfect:
                    file = "perfect.mp3";
                    break;
                case R.id.btnFight:
                    file = "fight.mp3";
                    break;
                case R.id.btnFinal:
                    file = "_final.mp3";
                    break;
                case R.id.btnChina:
                    file = "china.mp3";
                    break;
                case R.id.btnJapan:
                    file = "japan.mp3";
                    break;
                case R.id.btnUSA:
                    file = "usa.mp3";
                    break;
                case R.id.btnUSSR:
                    file = "ussr.mp3";
                    break;
                case R.id.btnIndia:
                    file = "india.mp3";
                    break;
                case R.id.btnThailand:
                    file = "thailand.mp3";
                    break;
                case R.id.btnSpain:
                    file = "spain.mp3";
                    break;
                case R.id.btnBrazil:
                    file = "brazil.mp3";
                    break;
                case R.id.btnWin:
                    file = "win.mp3";
                    break;
                case R.id.btnLose:
                    file = "lose.mp3";
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
