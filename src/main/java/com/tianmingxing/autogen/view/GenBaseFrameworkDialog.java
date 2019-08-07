package com.tianmingxing.autogen.view;

import com.intellij.ide.util.PackageChooserDialog;
import com.intellij.ide.util.TreeFileChooserFactory;
import com.intellij.json.JsonFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.psi.PsiManager;
import com.intellij.ui.treeStructure.Tree;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-08-07
 */
public class GenBaseFrameworkDialog extends DialogWrapper {
    private JTextField projectName;
    private JTextField genPath;
    private JPanel panel;

    public GenBaseFrameworkDialog(@Nullable Project project) {
        super(project);
        init();
        setTitle("生成基本框架配置");

        PackageChooserDialog packageChooserDialog = new PackageChooserDialog("HW", project);
        packageChooserDialog.show();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return panel;
    }
}
