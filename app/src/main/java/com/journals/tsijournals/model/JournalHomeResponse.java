package com.journals.tsijournals.model;

public class JournalHomeResponse {


    /**
     * status : true
     * abt_journal : 1
     * abt_journal_details : <p>Biochemistry &amp; Molecular Biology Letters is an Open Access Journal publishes the results of original research and reviews on the new mechanistic concepts and latest inventions in the fields of Biochemistry, Molecular Biology, Cellular Biosciences and Biotechnology. Manuscripts may be offered as research articles, review articles, short communication, rapid communication, letters to the editor, case-reports, etc.</p>
     <p style="text-align: justify;"><strong>Aims &amp; Scope </strong><br />
     Subject matters include but not limited to: <br />
     &bull;	Cellular and biochemical studies of cells, cell organelles, cellular molecular pathways, Cellular components such as proteins, carbohydrates, lipids, nucleic acids and other biologically active molecules and metabolism <br />
     &bull;	Synthetic biology <br />
     &bull;	Functions and dynamics of metabolic pathways<br />
     &bull;	Applied biochemistry<br />
     &bull;	Bioenergetics, biochemical mechanisms <br />
     &bull;	Industrial applications of biochemistry</p>
     <p style="text-align: justify;">The journal encourages research scientists, faculty, and students who are actively involved in scientific research and/or teaching at all levels, to submit their articles for intensive peer-reviewing and expedite publishing. Individuals from small and non-research oriented institutions are especially encouraged to submit their original articles for publication consideration.</p>
     <p style="text-align: justify;">Submit manuscript at <a href="https://www.scholarscentral.org/submissions/biochemistry-molecular-biology-letters.html">https://www.scholarscentral.org/submissions/biochemistry-molecular-biology-letters.html</a>  or send as an e-mail attachment to the Editorial Office <a href="mailto:editor@tsijournals.com">editor@tsijournals.com</a></p><blockquote class="blockquotes-v4"><p class="blockquotes-v4-text">*2016 Journal Impact Factor was established by dividing the number of articles published in 2014 and 2015 with the number of times they are cited in 2016 based on Google search and the Scholar Citation Index database. If 'X' is the total number of articles published in 2014 and 2015, and 'Y' is the number of times these articles were cited in indexed journals during 2016 then, impact factor = Y/X</p></blockquote>
     */

    private boolean status;
    private int abt_journal;
    private String abt_journal_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbt_journal() {
        return abt_journal;
    }

    public void setAbt_journal(int abt_journal) {
        this.abt_journal = abt_journal;
    }

    public String getAbt_journal_details() {
        return abt_journal_details;
    }

    public void setAbt_journal_details(String abt_journal_details) {
        this.abt_journal_details = abt_journal_details;
    }
}
