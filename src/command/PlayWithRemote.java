package command;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class PlayWithRemote extends JFrame {

    JLabel lblTv;
    JLabel lblRadio;
    JLabel lblTvState;
    JLabel lblTvVolume;
    JLabel lblRadioState;
    JLabel lblRadioVolume;
    JButton btnUndo;

    private IElectronicDevice tv;
    private IElectronicDevice radio;

    private Remote tvRemote;
    private Remote radioRemote;

    private LinkedList<DeviceButton> commandsList;

    public PlayWithRemote() {
        commandsList = new LinkedList<DeviceButton>();

        tv = new Television();
        radio = new Radio();
        tvRemote = new Remote(tv);
        radioRemote = new Remote(radio);

        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Commands");

        JPanel pane = new JPanel();


        getContentPane().add(pane);
        pane.setLayout(null);

        lblTv = new JLabel("TV");
        lblTv.setBounds(10, 11, 46, 14);
        pane.add(lblTv);

        lblRadio = new JLabel("Radio");
        lblRadio.setBounds(174, 11, 46, 14);
        pane.add(lblRadio);

        lblTvState = new JLabel("TV State: " + (tv.isOn() ? "On" : "Off"));
        lblTvState.setBounds(10, 36, 100, 14);
        pane.add(lblTvState);

        lblTvVolume = new JLabel("TV Volume: " + tv.getVolume());
        lblTvVolume.setBounds(10, 61, 100, 14);
        pane.add(lblTvVolume);

        lblRadioState = new JLabel("Radio State: " + (radio.isOn() ? "On" : "Off"));
        lblRadioState.setBounds(174, 36, 100, 14);
        pane.add(lblRadioState);

        lblRadioVolume = new JLabel("Radio Volume: " + radio.getVolume());
        lblRadioVolume.setBounds(174, 61, 100, 14);
        pane.add(lblRadioVolume);

        JButton btnOn = new JButton("Power");
        btnOn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tv.isOn()) {
                    tvRemote.turnOff.press();
                    commandsList.addFirst(tvRemote.turnOff);
                } else {
                    tvRemote.turnOn.press();
                    commandsList.addFirst(tvRemote.turnOn);
                }
                updateStuff();
            }
        });
        btnOn.setBounds(10, 110, 100, 23);
        pane.add(btnOn);

        JButton button = new JButton("+");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tvRemote.volumeUp.press();
                commandsList.addFirst(tvRemote.volumeUp);
                updateStuff();
            }
        });
        button.setBounds(66, 144, 46, 23);
        pane.add(button);

        JButton button_1 = new JButton("-");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tvRemote.volumeDown.press();
                commandsList.addFirst(tvRemote.volumeDown);
                updateStuff();
            }
        });
        button_1.setBounds(10, 144, 46, 23);
        pane.add(button_1);

        JButton button_2 = new JButton("Power");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radio.isOn()) {
                    radioRemote.turnOff.press();
                    commandsList.addFirst(radioRemote.turnOff);
                } else {
                    radioRemote.turnOn.press();
                    commandsList.addFirst(radioRemote.turnOn);
                }
                updateStuff();
            }
        });
        button_2.setBounds(157, 110, 102, 23);
        pane.add(button_2);

        JButton button_3 = new JButton("-");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radioRemote.volumeDown.press();
                commandsList.addFirst(radioRemote.volumeDown);
                updateStuff();
            }
        });
        button_3.setBounds(157, 144, 46, 23);
        pane.add(button_3);

        JButton button_4 = new JButton("+");
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radioRemote.volumeUp.press();
                commandsList.addFirst(radioRemote.volumeUp);
                updateStuff();
            }
        });
        button_4.setBounds(213, 144, 46, 23);
        pane.add(button_4);

        btnUndo = new JButton("Undo");
        btnUndo.setEnabled(false);
        btnUndo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                commandsList.removeFirst().pressUndo();
                updateStuff();
            }
        });
        btnUndo.setBounds(92, 210, 89, 23);
        pane.add(btnUndo);
        this.setVisible(true);

    }

    public void updateStuff() {
        lblTvState.setText("TV State: " + (tv.isOn() ? "On" : "Off"));
        lblRadioState.setText("Radio State: " + (radio.isOn() ? "On" : "Off"));
        lblTvVolume.setText("TV Volume: " + String.valueOf(tv.getVolume()));
        lblRadioVolume.setText("Radio Volume: " + String.valueOf(radio.getVolume()));

        if (commandsList.isEmpty()){
            btnUndo.setEnabled(false);
        } else {
            btnUndo.setEnabled(true);
        }
    }

    public static void main(String[] args) {

        new PlayWithRemote();

    }
}
