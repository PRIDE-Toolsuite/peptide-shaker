package eu.isas.peptideshaker.gui;

import com.compomics.software.ToolFactory;
import com.compomics.util.examples.BareBonesBrowserLaunch;
import eu.isas.peptideshaker.gui.gettingStarted.GettingStartedDialog;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 * A simple welcome dialog with the option to open an existing project or create
 * a new one.
 *
 * @author Harald Barsnes
 * @author Marc Vaudel
 */
public class WelcomeDialog extends javax.swing.JDialog {

    /**
     * The PeptideShaker parent frame.
     */
    private PeptideShakerGUI peptideShakerGUI;
    /**
     * A reference to the open dialog.
     */
    private NewDialog openDialog;

    /**
     * Create a new WelcomeDialog.
     *
     * @param peptideShakerGUI the dialog parent
     * @param modal modal or not modal
     */
    public WelcomeDialog(PeptideShakerGUI peptideShakerGUI, boolean modal) {
        super(peptideShakerGUI, modal);
        this.peptideShakerGUI = peptideShakerGUI;
        initComponents();

        openDialog = new NewDialog(peptideShakerGUI, false);
        setLocationRelativeTo(peptideShakerGUI);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        openJButton = new javax.swing.JButton();
        newJButton = new javax.swing.JButton();
        compomicsButton = new javax.swing.JButton();
        probeButton = new javax.swing.JButton();
        isasButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        searchJButton = new javax.swing.JButton();
        quantifyJButton = new javax.swing.JButton();
        recentProjectsLabel = new javax.swing.JLabel();
        reshakeJButton = new javax.swing.JButton();
        gettingStartedJButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome to PeptideShaker");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        openJButton.setFont(openJButton.getFont().deriveFont(openJButton.getFont().getStyle() | java.awt.Font.BOLD, openJButton.getFont().getSize()+3));
        openJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/peptide-shaker-medium-blue-shadow.png"))); // NOI18N
        openJButton.setText("Open Project");
        openJButton.setToolTipText("Open an existing PeptideShaker project");
        openJButton.setFocusPainted(false);
        openJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        openJButton.setIconTextGap(20);
        openJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openJButtonActionPerformed(evt);
            }
        });

        newJButton.setFont(newJButton.getFont().deriveFont(newJButton.getFont().getStyle() | java.awt.Font.BOLD, newJButton.getFont().getSize()+3));
        newJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/peptide-shaker-medium-orange-shadow.png"))); // NOI18N
        newJButton.setText("New Project");
        newJButton.setToolTipText("Create a new PeptideShaker project");
        newJButton.setFocusPainted(false);
        newJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newJButton.setIconTextGap(24);
        newJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJButtonActionPerformed(evt);
            }
        });

        compomicsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/compomics.png"))); // NOI18N
        compomicsButton.setToolTipText("Computational Omics and Systems Biology Group");
        compomicsButton.setBorder(null);
        compomicsButton.setBorderPainted(false);
        compomicsButton.setContentAreaFilled(false);
        compomicsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                compomicsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compomicsButtonMouseExited(evt);
            }
        });
        compomicsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compomicsButtonActionPerformed(evt);
            }
        });

        probeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/probe.png"))); // NOI18N
        probeButton.setToolTipText("Proteomics Unit at the University of Bergen");
        probeButton.setBorder(null);
        probeButton.setBorderPainted(false);
        probeButton.setContentAreaFilled(false);
        probeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                probeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                probeButtonMouseExited(evt);
            }
        });
        probeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probeButtonActionPerformed(evt);
            }
        });

        isasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/isas.png"))); // NOI18N
        isasButton.setToolTipText("<html>ISAS - Institute for Analytical Science</html>");
        isasButton.setBorder(null);
        isasButton.setBorderPainted(false);
        isasButton.setContentAreaFilled(false);
        isasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                isasButtonMouseExited(evt);
            }
        });
        isasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isasButtonActionPerformed(evt);
            }
        });

        searchJButton.setFont(searchJButton.getFont().deriveFont(searchJButton.getFont().getStyle() | java.awt.Font.BOLD, searchJButton.getFont().getSize()+3));
        searchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchgui-medium-shadow.png"))); // NOI18N
        searchJButton.setText("Start Search");
        searchJButton.setToolTipText("Start a SearchGUI protein identification search");
        searchJButton.setFocusPainted(false);
        searchJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        searchJButton.setIconTextGap(20);
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        quantifyJButton.setFont(quantifyJButton.getFont().deriveFont(quantifyJButton.getFont().getStyle() | java.awt.Font.BOLD, quantifyJButton.getFont().getSize()+3));
        quantifyJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reporter_logo.png"))); // NOI18N
        quantifyJButton.setText("Reporter Ions");
        quantifyJButton.setToolTipText("<html>\nQuantify your proteins using reporter ions.<br>\n(Coming soon...)\n</html>");
        quantifyJButton.setFocusPainted(false);
        quantifyJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quantifyJButton.setIconTextGap(11);
        quantifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantifyJButtonActionPerformed(evt);
            }
        });

        recentProjectsLabel.setFont(recentProjectsLabel.getFont().deriveFont(recentProjectsLabel.getFont().getStyle() | java.awt.Font.BOLD));
        recentProjectsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/next_grey.png"))); // NOI18N
        recentProjectsLabel.setText("<html><a href>Recent Projects</html>");
        recentProjectsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        recentProjectsLabel.setIconTextGap(-4);
        recentProjectsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recentProjectsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recentProjectsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recentProjectsLabelMouseExited(evt);
            }
        });

        reshakeJButton.setFont(reshakeJButton.getFont().deriveFont(reshakeJButton.getFont().getStyle() | java.awt.Font.BOLD, reshakeJButton.getFont().getSize()+3));
        reshakeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/relims_logo.png"))); // NOI18N
        reshakeJButton.setText("Reshake");
        reshakeJButton.setToolTipText("<html>\nReanalyze a PRIDE experiment.<br>\n(Coming soon...)\n</html>");
        reshakeJButton.setFocusPainted(false);
        reshakeJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reshakeJButton.setIconTextGap(23);
        reshakeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reshakeJButtonActionPerformed(evt);
            }
        });

        gettingStartedJButton1.setFont(gettingStartedJButton1.getFont().deriveFont(gettingStartedJButton1.getFont().getStyle() | java.awt.Font.BOLD, gettingStartedJButton1.getFont().getSize()+3));
        gettingStartedJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help-medium-shadow.png"))); // NOI18N
        gettingStartedJButton1.setText("Getting Started");
        gettingStartedJButton1.setToolTipText("Open the Getting Started tutorial");
        gettingStartedJButton1.setFocusPainted(false);
        gettingStartedJButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gettingStartedJButton1.setIconTextGap(20);
        gettingStartedJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gettingStartedJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(recentProjectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(reshakeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(newJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(openJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(quantifyJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gettingStartedJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(compomicsButton)
                                .addGap(18, 18, 18)
                                .addComponent(probeButton)
                                .addGap(10, 10, 10)
                                .addComponent(isasButton)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reshakeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gettingStartedJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantifyJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentProjectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(compomicsButton)
                    .addComponent(probeButton)
                    .addComponent(isasButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {newJButton, openJButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Open the dialog for creating a new project.
     *
     * @param evt
     */
    private void newJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJButtonActionPerformed
        this.setVisible(false);
        openDialog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newJButtonActionPerformed

    /**
     * Open the dialog for opening an existing project.
     *
     * @param evt
     */
    private void openJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openJButtonActionPerformed
        this.setVisible(false);

        openDialog.setSearchParamatersFiles(new ArrayList<File>());
        File newFile = peptideShakerGUI.getUserSelectedFile(".cps", "Supported formats: PeptideShaker (.cps)", "Open PeptideShaker Project", true);

        if (newFile != null) {
            if (!newFile.getName().toLowerCase().endsWith("cps")) {
                JOptionPane.showMessageDialog(this, "Not a PeptideShaker file (.cps).",
                        "Wrong File.", JOptionPane.ERROR_MESSAGE);
            } else {
                // get the properties files
                for (File file : newFile.getParentFile().listFiles()) {
                    if (file.getName().toLowerCase().endsWith(".properties")) {
                        if (!openDialog.getSearchParametersFiles().contains(file)) {
                            openDialog.getSearchParametersFiles().add(file);
                        }
                    }
                }

                this.setVisible(false);
                peptideShakerGUI.importPeptideShakerFile(newFile);
                peptideShakerGUI.getUserPreferences().addRecentProject(newFile);
                peptideShakerGUI.updateRecentProjectsList();
                peptideShakerGUI.setLastSelectedFolder(newFile.getAbsolutePath());
                this.dispose();
            }
        }
    }//GEN-LAST:event_openJButtonActionPerformed

    /**
     * Change the cursor to a hand cursor.
     *
     * @param evt
     */
    private void compomicsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compomicsButtonMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_compomicsButtonMouseEntered

    /**
     * Change the cursor back to the default cursor.
     *
     * @param evt
     */
    private void compomicsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compomicsButtonMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_compomicsButtonMouseExited

    /**
     * Open the Compomics web page.
     *
     * @param evt
     */
    private void compomicsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compomicsButtonActionPerformed
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BareBonesBrowserLaunch.openURL("http://compomics.wordpress.com");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_compomicsButtonActionPerformed

    /**
     * Change the cursor to a hand cursor.
     *
     * @param evt
     */
    private void probeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_probeButtonMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_probeButtonMouseEntered

    /**
     * Change the cursor back to the default cursor.
     *
     * @param evt
     */
    private void probeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_probeButtonMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_probeButtonMouseExited

    /**
     * Open the PROBE web page.
     *
     * @param evt
     */
    private void probeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probeButtonActionPerformed
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BareBonesBrowserLaunch.openURL("http://probe.uib.no");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_probeButtonActionPerformed

    /**
     * Change the cursor to a hand cursor.
     *
     * @param evt
     */
    private void isasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isasButtonMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_isasButtonMouseEntered

    /**
     * Change the cursor back to the default cursor.
     *
     * @param evt
     */
    private void isasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isasButtonMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_isasButtonMouseExited

    /**
     * Open the ISAS web page.
     *
     * @param evt
     */
    private void isasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isasButtonActionPerformed
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BareBonesBrowserLaunch.openURL("http://www.isas.de");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_isasButtonActionPerformed

    /**
     * Open SearchGUI.
     *
     * @param evt
     */
    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        new Thread(new Runnable() {
            public void run() { 
                try {
                    ToolFactory.startSearchGUI(peptideShakerGUI);
                } catch (Exception e) {
                    peptideShakerGUI.catchException(e);
                }
            }
        }, "StartSearchGUI").start();
    }//GEN-LAST:event_searchJButtonActionPerformed

    /**
     * Start Reporter.
     *
     * @param evt
     */
    private void quantifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantifyJButtonActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {
                    ToolFactory.startReporter(peptideShakerGUI);
                } catch (Exception e) {
                    peptideShakerGUI.catchException(e);
                }
            }
        }, "StartReporter").start();
    }//GEN-LAST:event_quantifyJButtonActionPerformed

    /**
     * Change the cursor to a hand cursor.
     *
     * @param evt
     */
    private void recentProjectsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recentProjectsLabelMouseEntered
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_recentProjectsLabelMouseEntered

    /**
     * Change the cursor back to the default cursor.
     *
     * @param evt
     */
    private void recentProjectsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recentProjectsLabelMouseExited
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_recentProjectsLabelMouseExited

    /**
     * Open a recently opened project.
     *
     * @param evt
     */
    private void recentProjectsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recentProjectsLabelMouseClicked
        JPopupMenu popupMenu = new JPopupMenu();
        peptideShakerGUI.loadRecentProjectsList(popupMenu, this);
        popupMenu.show(recentProjectsLabel, evt.getX(), evt.getY());
    }//GEN-LAST:event_recentProjectsLabelMouseClicked

    /**
     * Open Relims.
     *
     * @param evt
     */
    private void reshakeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reshakeJButtonActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {
                    ToolFactory.startRelims(peptideShakerGUI);
                } catch (Exception e) {
                    peptideShakerGUI.catchException(e);
                }
            }
        }, "StartRelims").start();
    }//GEN-LAST:event_reshakeJButtonActionPerformed

    /**
     * Open the Getting Started tutorial.
     *
     * @param evt
     */
    private void gettingStartedJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gettingStartedJButton1ActionPerformed
        new GettingStartedDialog(peptideShakerGUI, true);
    }//GEN-LAST:event_gettingStartedJButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton compomicsButton;
    private javax.swing.JButton gettingStartedJButton1;
    private javax.swing.JButton isasButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newJButton;
    private javax.swing.JButton openJButton;
    private javax.swing.JButton probeButton;
    private javax.swing.JButton quantifyJButton;
    private javax.swing.JLabel recentProjectsLabel;
    private javax.swing.JButton reshakeJButton;
    private javax.swing.JButton searchJButton;
    // End of variables declaration//GEN-END:variables
}
