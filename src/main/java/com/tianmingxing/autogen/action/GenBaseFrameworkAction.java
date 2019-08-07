package com.tianmingxing.autogen.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.DialogWrapper;
import com.tianmingxing.autogen.view.GenBaseFrameworkDialog;
import org.jetbrains.annotations.NotNull;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-08-07
 */
public class GenBaseFrameworkAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        DialogWrapper dialog = new GenBaseFrameworkDialog(e.getProject());
        dialog.show();
    }
}
