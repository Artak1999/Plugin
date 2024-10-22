package com.example.firstplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class MyAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog(e.getProject(), "Hello from MyAction!", "Greeting", Messages.getInformationIcon());
    }
}
