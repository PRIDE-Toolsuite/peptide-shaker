package eu.isas.peptideshaker.preferences;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * In this class are stored the user preferences for PeptideShaker
 *
 * @author Marc Vaudel
 */
public class UserPreferences implements Serializable {

    /**
     * The serial number for serialization compatibilty
     */
    static final long serialVersionUID = 3298905131097982664L;
    /**
     * The color used for the sparkline bar chart plots.
     */
    private Color sparklineColor = new Color(110, 196, 97);
    /**
     * The color used for the non-validated sparkline bar chart plots.
     */
    private Color sparklineColorNonValidated = new Color(208, 19, 19);
    /**
     * The color used for the not found sparkline bar chart plots
     */
    private Color sparklineColorNotFound = new Color(212, 212, 212);
    /**
     * The color used for the possible values sparkline bar chart plots
     */
    private Color sparklineColorPossible = new Color(100, 150, 255);
    /**
     * The color of the selected peptide
     */
    private Color peptideSelected = new Color(0, 0, 255);
    /**
     * The recent projects
     */
    private ArrayList<String> recentProjects = new ArrayList<String>();
    /**
     * Show/hide sliders
     */
    private boolean showSliders = false;

    /**
     * Constructor
     */
    public UserPreferences() {
    }

    /**
     * Getter for the sparkline color
     * @return the sparkline color
     */
    public Color getSparklineColor() {
        return sparklineColor;
    }

    /**
     * Setter for the sparkline color
     * @param sparklineColor  the sparkline color
     */
    public void setSparklineColor(Color sparklineColor) {
        this.sparklineColor = sparklineColor;
    }

    /**
     * Getter for the non-validated sparkline color
     * @return the non-validated sparkline color
     */
    public Color getSparklineColorNonValidated() {
        if (sparklineColorNonValidated == null) {
            sparklineColorNonValidated = new Color(255, 0, 0);
        }
        return sparklineColorNonValidated;
    }

    /**
     * Returns the color for a selected peptide
     * @return the color for a selected peptide
     */
    public Color getPeptideSelected() {
        if (peptideSelected == null) {
            peptideSelected = new Color(0, 0, 255);
        }
        return peptideSelected;
    }

    /**
     * Returns the color for a not found sparkline bar chart plots
     * @return the color for a not found sparkline bar chart plots
     */
    public Color getSparklineColorNotFound() {
        if (sparklineColorNotFound == null) {
            sparklineColorNotFound = Color.LIGHT_GRAY;
        }
        return sparklineColorNotFound;
    }

    /**
     * Setter for the non-validated sparkline color
     * @param sparklineColorNonValidated the non-validated sparkline color
     */
    public void setSparklineColorNonValidated(Color sparklineColorNonValidated) {
        this.sparklineColorNonValidated = sparklineColorNonValidated;
    }
    
    /**
     * Returns the color for a possible sparkline bar chart plots
     * @return the color for a possible sparkline bar chart plots
     */
    public Color getSparklineColorPossible() {
        if (sparklineColorPossible == null) {
            sparklineColorPossible = new Color(235, 235, 235);
        }
        return sparklineColorPossible;
    }

    /**
     * Setter for the possible sparkline color
     * @param sparklineColorPossible the possible sparkline color
     */
    public void setSparklineColorPossible(Color sparklineColorPossible) {
        this.sparklineColorPossible = sparklineColorPossible;
    }

    /**
     * Returns whether sliders should be displayed
     * @return  whether sliders should be displayed
     */
    public boolean showSliders() {
        return showSliders;
    }

    /**
     * Sets whether sliders should be displayed
     * @param showSliders  whether sliders should be displayed
     */
    public void setShowSliders(boolean showSliders) {
        this.showSliders = showSliders;
    }

    /**
     * Returns the paths of the recent projects
     * @return the paths of the recent projects
     */
    public ArrayList<String> getRecentProjects() {
        return recentProjects;
    }

    /**
     * Removes a recent project from the list
     * @param recentProject the recent project to remove
     */
    public void removerRecentProject(String recentProject) {
        recentProjects.remove(recentProject);
    }

    /**
     * Adds a recent project to the list and limits the list of recent projects to a size of 10
     * @param recentProject the path of the recent project to add
     */
    public void addRecentProject(String recentProject) {
        if (recentProjects.contains(recentProject)) {
            recentProjects.remove(recentProject);
        }
        recentProjects.add(0, recentProject);
        while (recentProjects.size() > 10) {
            recentProjects.remove(recentProjects.size() - 1);
        }
    }

    /**
     * Adds a recent project to the list and limits the list of recent projects to a size of 10
     * @param recentProject the recent project to add
     */
    public void addRecentProject(File recentProject) {
        addRecentProject(recentProject.getAbsolutePath());
    }
}
