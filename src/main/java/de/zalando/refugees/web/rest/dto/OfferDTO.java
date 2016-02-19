package de.zalando.refugees.web.rest.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Offer entity.
 */
public class OfferDTO implements Serializable
{

	private Long id;

	private Integer quantity;

	private Long categoryId;
	private Long seasonId;
	private Long sizeId;
	private Long donationConditionId;
	private Long genderId;
	private Long organizationId;
	private Long statusId;
	
	private String categoryName;
	private String seasonValue;
	private String sizeValue;
	private String donationConditionValue;
	private String genderValue;
	private String organizationName;
	private String statusValue;

	public String getCategoryName()
	{
		return categoryName;
	}

	public void setCategoryName( String categoryName )
	{
		this.categoryName = categoryName;
	}

	public String getSeasonValue()
	{
		return seasonValue;
	}

	public void setSeasonValue( String seasonValue )
	{
		this.seasonValue = seasonValue;
	}

	public String getSizeValue()
	{
		return sizeValue;
	}

	public void setSizeValue( String sizeValue )
	{
		this.sizeValue = sizeValue;
	}

	public String getDonationConditionValue()
	{
		return donationConditionValue;
	}

	public void setDonationConditionValue( String donationConditionValue )
	{
		this.donationConditionValue = donationConditionValue;
	}

	public String getGenderValue()
	{
		return genderValue;
	}

	public void setGenderValue( String genderValue )
	{
		this.genderValue = genderValue;
	}

	public String getOrganizationName()
	{
		return organizationName;
	}

	public void setOrganizationName( String organizationName )
	{
		this.organizationName = organizationName;
	}

	public String getStatusValue()
	{
		return statusValue;
	}

	public void setStatusValue( String statusValue )
	{
		this.statusValue = statusValue;
	}

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public Integer getQuantity()
	{
		return quantity;
	}

	public void setQuantity( Integer quantity )
	{
		this.quantity = quantity;
	}

	public Long getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId( Long categoryId )
	{
		this.categoryId = categoryId;
	}

	public Long getSeasonId()
	{
		return seasonId;
	}

	public void setSeasonId( Long seasonId )
	{
		this.seasonId = seasonId;
	}

	public Long getSizeId()
	{
		return sizeId;
	}

	public void setSizeId( Long sizeId )
	{
		this.sizeId = sizeId;
	}

	public Long getDonationConditionId()
	{
		return donationConditionId;
	}

	public void setDonationConditionId( Long donationConditionId )
	{
		this.donationConditionId = donationConditionId;
	}

	public Long getGenderId()
	{
		return genderId;
	}

	public void setGenderId( Long genderId )
	{
		this.genderId = genderId;
	}

	public Long getOrganizationId()
	{
		return organizationId;
	}

	public void setOrganizationId( Long organizationId )
	{
		this.organizationId = organizationId;
	}

	public Long getStatusId()
	{
		return statusId;
	}

	public void setStatusId( Long statusId )
	{
		this.statusId = statusId;
	}

	@Override
	public boolean equals( Object o )
	{
		if ( this == o )
		{
			return true;
		}
		if ( o == null || getClass() != o.getClass() )
		{
			return false;
		}

		OfferDTO offerDTO = (OfferDTO) o;

		if ( !Objects.equals( id, offerDTO.id ) )
			return false;

		return true;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode( id );
	}

	@Override
	public String toString()
	{
		return "OfferDTO{" + "id=" + id + ", quantity='" + quantity + "'" + '}';
	}
}
