package org.openmrs;

import java.util.Date;

import org.openmrs.synchronization.Synchronizable;

/**
 * This represents a single concept within a concept set.
 */
public class ConceptSet implements java.io.Serializable, Synchronizable {

	public static final long serialVersionUID = 3787L;

	// Fields
	private Integer conceptSetId;
	private Concept concept;
	private Concept conceptSet;
	private Double sortWeight;
	private User creator;
	private Date dateCreated;
	private String guid;
    private transient String lastRecordGuid;
    
    public String getLastRecordGuid() {
        return lastRecordGuid;
    }

    public void setLastRecordGuid(String lastRecordGuid) {
        this.lastRecordGuid = lastRecordGuid;
    }
	
  public String getGuid() {
      return guid;
  }

  public void setGuid(String guid) {
      this.guid = guid;
  }

	// Constructors

	/** default constructor */
	public ConceptSet() {
	}
	
	public ConceptSet(Concept concept, Double weight) {
		setConcept(concept);
		setSortWeight(weight);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof ConceptSet) {
			ConceptSet c = (ConceptSet)obj;
			return (this.concept.equals(c.getConcept()) &&
					this.conceptSet.equals(c.getConceptSet()));
		}
		return false;
	}
	
	public int hashCode() {
		if (this.getConcept() == null || this.getConceptSet() == null) return super.hashCode();
		return this.getConcept().hashCode() + this.getConceptSet().hashCode();
	}

	// Property accessors

	
	/**
	 * Gets the concept set identifier. 
	 *
	 * @return	the concept set identifier
	 */
	public Integer getConceptSetId() { 
		return conceptSetId;
	}
	
	/**
	 * Sets the concept set identifier.
	 * 
	 * @param conceptSetId
	 * 				The concept set identifier.
	 */
	public void setConceptSetId(Integer conceptSetId) { 
		this.conceptSetId = conceptSetId;
	}
	
	/**
	 * 
	 */
	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

	/**
	 * 
	 */
	public Concept getConceptSet() {
		return conceptSet;
	}

	public void setConceptSet(Concept set) {
		this.conceptSet = set;
	}

	/**
	 * @return Returns the sortWeight.
	 */
	public Double getSortWeight() {
		return sortWeight;
	}

	/**
	 * @param sortWeight
	 *            The sortWeight to set.
	 */
	public void setSortWeight(Double sortWeight) {
		this.sortWeight = sortWeight;
	}

	/**
	 * @return Returns the creator.
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator
	 *            The creator to set.
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return Returns the dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            The dateCreated to set.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}