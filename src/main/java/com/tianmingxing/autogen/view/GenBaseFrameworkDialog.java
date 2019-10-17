package com.tianmingxing.autogen.view;

import com.intellij.ide.util.PackageChooserDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-08-07
 */
public class GenBaseFrameworkDialog extends DialogWrapper {
    private JTextField tableName;
    private JTextField genPath;
    private JPanel panel;
    private Project project;

    public GenBaseFrameworkDialog(@Nullable Project project) {
        super(project);
        this.project = project;
        init();
        setTitle("生成基本框架配置");


        genPath.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                PackageChooserDialog packageChooserDialog = new PackageChooserDialog("选择目录", project);
                packageChooserDialog.show();
            }
        });
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return panel;
    }

    @Override
    protected void doOKAction() {
        super.doOKAction();
    }
}
