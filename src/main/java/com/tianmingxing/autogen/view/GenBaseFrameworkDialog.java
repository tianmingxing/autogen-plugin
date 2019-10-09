package com.tianmingxing.autogen.view;

import com.intellij.ide.util.PackageChooserDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.tianmingxing.autogen.service.GenService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-08-07
 */
public class GenBaseFrameworkDialog extends DialogWrapper {
    private JTextField projectName;
    private JTextField genPath;
    private JPanel panel;
    private Project project;

    public GenBaseFrameworkDialog(@Nullable Project project) {
        super(project);
        this.project = project;
        init();
        setTitle("生成基本框架配置");

//        PackageChooserDialog packageChooserDialog = new PackageChooserDialog("HW", project);
//        packageChooserDialog.show();

    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return panel;
    }

    @Override
    protected void doOKAction() {
        GenService.gen(projectName.getText());
        super.doOKAction();
    }
}
